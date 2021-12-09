import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.PathCMS)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('AgreeCMS/Login/DashboardCMS_Text'), 0)

WebUI.verifyElementPresent(findTestObject('AgreeCMS/Login/Username_textfield'), 0)

WebUI.setText(findTestObject('AgreeCMS/Login/Username_textfield'), 'superadmin1@agree.id')

WebUI.verifyElementPresent(findTestObject('AgreeCMS/Login/Password_textfield'), 0)

WebUI.setText(findTestObject('AgreeCMS/Login/Password_textfield'), 'password')

WebUI.verifyElementPresent(findTestObject('AgreeCMS/Login/Masuk_button'), 0)

WebUI.click(findTestObject('AgreeCMS/Login/Masuk_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

