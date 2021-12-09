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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Update_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Update_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/BuatAkunAgree_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/NamaLengkap_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Username_TextField'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Password_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/KetikUlangPassword_TextField'), 0)

Mobile.comment('Input textfield')

Mobile.setText(findTestObject('AgreeMitra/Create Account/NamaLengkap_TextField'), 'Soleh H\' A', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), '08' + CustomKeywords.'abstraction.customKeyword.randomInt'(
        10), 0)

Mobile.setText(findTestObject('AgreeMitra/Login/Password_TextField'), 'rebahan', 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/KetikUlangPassword_TextField'), 'rebahan', 0)

Mobile.hideKeyboard()

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_CheckBox_3'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_Text'), 0)

Mobile.scrollToText('Sudah punya akun ?', FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Field Belum Terisi')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Adaisiankosong_Popup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/05. Button - Ok Mantap'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/UsernameBelumDiisi_Text'), 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/Username_TextField'), 'rebahan3', 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/KetentuandiCentang_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/SayaMenyetujui_CheckBox_3'), 0)

Mobile.tap(findTestObject('AgreeMitra/Login/Buatakun_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Berhasil_Popup'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Beranda_Text'), 0)

