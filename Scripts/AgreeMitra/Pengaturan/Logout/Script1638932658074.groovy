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

Mobile.startApplication(GlobalVariable.Path, true)

CustomKeywords.'abstraction.customKeyword.logintoApps'(GlobalVariable.Username, GlobalVariable.Password)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Pengaturan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Setting/Pengaturan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Keluar/Keluar_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Setting/Keluar/Keluar_Text'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.comment('Tidak setuju')

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.comment('Setuju')

Mobile.tap(findTestObject('AgreeMitra/Setting/Keluar/Keluar_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Masuk_Button'), 0)

