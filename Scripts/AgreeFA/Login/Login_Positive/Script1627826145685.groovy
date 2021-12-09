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

Mobile.startApplication(GlobalVariable.Path3, true)

//Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Update_Button'), 0)
//
//Mobile.tap(findTestObject('AgreeMitra/Login/Update_Button'), 0)
Mobile.verifyElementExist(findTestObject('AgreeFA/Login/Username_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Login/Password_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Login/Masuk_Button'), 0)

Mobile.setText(findTestObject('AgreeFA/Login/Username_TextField'), 'Haris001@amsen.id', 0)

Mobile.setText(findTestObject('AgreeFA/Login/Password_TextField'), 'password', 0)

Mobile.tap(findTestObject('AgreeFA/Login/Masuk_Button'), 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Beranda_Text'), 0)

