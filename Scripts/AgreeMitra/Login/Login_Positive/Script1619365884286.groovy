import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.Path, true)

//Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Update_Button'), 0)
//
//Mobile.tap(findTestObject('AgreeMitra/Login/Update_Button'), 0)
Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Masuk_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Masuk_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/MasukaplikasiAgree_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Username_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Password_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Masuk_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Mata_Icon'), 0)

Mobile.comment('Munculin error untuk field belum diiisi')

Mobile.tap(findTestObject('AgreeMitra/Login/Masuk_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Adaisiankosong_Popup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/UsernameBelumDiisi_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/PasswordBelumDiisi_Text'), 0)

Mobile.setText(findTestObject('AgreeMitra/Login/Username_TextField'), 'rebahan3', 0)

Mobile.verifyElementNotExist(findTestObject('AgreeMitra/Login/UsernameBelumDiisi_Text'), 0)

Mobile.setText(findTestObject('AgreeMitra/Login/Password_TextField'), 'rebahan', 0)

Mobile.verifyElementNotExist(findTestObject('AgreeMitra/Login/PasswordBelumDiisi_Text'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('AgreeMitra/Login/Mata_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Masuk_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Beranda_Text'), 0)

