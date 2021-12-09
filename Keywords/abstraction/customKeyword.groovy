package abstraction
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import io.appium.java_client.android.AndroidDriver


class customKeyword {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}

	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}

	/**
	 * Send request and verify status code
	 * @param request request object, must be an instance of RequestObject
	 * @param expectedStatusCode
	 * @return a boolean to indicate whether the response status code equals the expected one
	 */
	@Keyword
	def verifyStatusCode(TestObject request, int expectedStatusCode) {
		if (request instanceof RequestObject) {
			RequestObject requestObject = (RequestObject) request
			ResponseObject response = WSBuiltInKeywords.sendRequest(requestObject)
			if (response.getStatusCode() == expectedStatusCode) {
				KeywordUtil.markPassed("Response status codes match")
			} else {
				KeywordUtil.markFailed("Response status code not match. Expected: " +
						expectedStatusCode + " - Actual: " + response.getStatusCode() )
			}
		} else {
			KeywordUtil.markFailed(request.getObjectId() + " is not a RequestObject")
		}
	}

	/**
	 * Add Header basic authorization field,
	 * this field value is Base64 encoded token from user name and password
	 * @param request object, must be an instance of RequestObject
	 * @param username username
	 * @param password password
	 * @return the original request object with basic authorization header field added
	 */
	@Keyword
	def addBasicAuthorizationProperty(TestObject request, String username, String password) {
		if (request instanceof RequestObject) {
			String authorizationValue = username + ":" + password
			authorizationValue = "Basic " + authorizationValue.bytes.encodeBase64().toString()

			// Find available basic authorization field and change its value to the new one, if any
			List<TestObjectProperty> headerProperties = request.getHttpHeaderProperties()
			boolean fieldExist = false
			for (int i = 0; i < headerProperties.size(); i++) {
				TestObjectProperty headerField = headerProperties.get(i)
				if (headerField.getName().equals('Authorization')) {
					KeywordUtil.logInfo("Found existent basic authorization field. Replacing its value.")
					headerField.setValue(authorizationValue)
					fieldExist = true
					break
				}
			}

			if (!fieldExist) {
				TestObjectProperty authorizationProperty = new TestObjectProperty("Authorization",
						ConditionType.EQUALS, authorizationValue, true)
				headerProperties.add(authorizationProperty)
			}
			KeywordUtil.markPassed("Basic authorization field has been added to request header")
		} else {
			KeywordUtil.markFailed(request.getObjectId() + "is not a RequestObject")
		}
		return request
	}
	/**
	 * Get Random String for Registration Email
	 * @param length is total length of random characters
	 * @return random string
	 */
	@Keyword
	def randomString(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyz"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}
	/**
	 * Get Random String for Registration Email
	 * @param length is total length of random characters
	 * @return random string
	 */
	@Keyword
	def randomInt(int length) {
		String chars = "0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}
	@Keyword
	def logintoApps(String Username, String Password){
		//		if(Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Update_Button'), 0)){
		//			Mobile.tap(findTestObject('AgreeMitra/Login/Update_Button'), 0)
		//		}
		//		else {
		//			Mobile.delay(2)
		//		}
		Mobile.tap(findTestObject('AgreeMitra/Login/Masuk_Button'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.setText(findTestObject('AgreeMitra/Login/Username_TextField'), Username, 0)
		Mobile.setText(findTestObject('AgreeMitra/Login/Password_TextField'), Password, 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('AgreeMitra/Login/Masuk_Button'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Beranda_Text'), 0)
	}
	@Keyword
	def logoutAppsMitra(){
		Mobile.tap(findTestObject('AgreeMitra/Setting/Pengaturan_Text'), 0)
		Mobile.tap(findTestObject('AgreeMitra/Setting/Keluar/Keluar_Text'), 0)
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)
	}
	@Keyword
	def logintoAppsFA(String Username, String Password){
		Mobile.setText(findTestObject('AgreeFA/Login/TextField_Username'), Username, 0)
		Mobile.setText(findTestObject('AgreeFA/Login/TextField_Password'), Password, 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('AgreeFA/Login/Button_login'), 0)
		Mobile.delay(2)
		//		Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Button_Beranda'), 0)
	}

	@Keyword
	def setDateTextField(String month, String date, String year) {
		Mobile.verifyElementExist(findTestObject('Abstract/datePicker1'), 0)
		Mobile.tap(findTestObject('Abstract/datePicker1'), 0)
		Mobile.tapAndHold(findTestObject('Abstract/datePicker1'), 3, 0)
		Mobile.setText(findTestObject('Abstract/datePicker1'), month, 0)
		Mobile.delay(2)
		Mobile.verifyElementExist(findTestObject('Abstract/datePicker2'), 0)
		Mobile.tap(findTestObject('Abstract/datePicker2'), 0)
		Mobile.tapAndHold(findTestObject('Abstract/datePicker2'), 3, 0)
		Mobile.setText(findTestObject('Abstract/datePicker2'), date, 0)
		Mobile.delay(2)
		Mobile.verifyElementExist(findTestObject('Abstract/datePicker3'), 0)
		Mobile.tap(findTestObject('Abstract/datePicker3'), 0)
		Mobile.tapAndHold(findTestObject('Abstract/datePicker3'), 3, 0)
		Mobile.setText(findTestObject('Abstract/datePicker3'), year, 0)
	}
	@Keyword
	def logintoCMS(String Username, String Password) {
		WebUI.setText(findTestObject('AgreeCMS/Login/Username_textfield'), Username)
		WebUI.verifyElementPresent(findTestObject('AgreeCMS/Login/Password_textfield'), 0)
		WebUI.setText(findTestObject('AgreeCMS/Login/Password_textfield'), Password)
		WebUI.click(findTestObject('AgreeCMS/Login/Masuk_button'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
	}
	//	@Keyword
	//	def uploadFile(int length){
	//		for (int i=0; i<length; i++) {
	//		Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/UploadGambarPratanam1_Button'),0)
	//		Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/UploadGambarPratanam1_Button'),0)
	//		Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Pilihdari_Popup'), 0)
	//		Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kamera_Button'), 0)
	//		Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)
	//		Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)
	//		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	//		Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'),0)
	//		Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'),0)
	//		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	//		}
	//
	//	}
}
