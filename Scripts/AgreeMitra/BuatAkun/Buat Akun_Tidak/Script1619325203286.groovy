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

Mobile.startApplication('C:\\Users\\anisa\\Downloads\\App-2.24.9-Dev.apk', true)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Update_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Update_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/BuatAkunAgree_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/NamaLengkap_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Username_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Password_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/KetikUlangPassword_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/NamaLengkap_TextField'), 'Selamat b\'inti K', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), '085715310256', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/Username_TextField'), 'cobasambal', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/Password_TextField'), 'cobasambal', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/KetikUlangPassword_TextField'), 'cobasambal', 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_CheckBox_2'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_CheckBox_2'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Tidak_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

