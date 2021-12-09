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

//String username = 'rebahan1'
//
def password = 'rebahan'

def newPassword1 = 'password'

def newPassword2 = 'password1'

CustomKeywords.'abstraction.customKeyword.logintoApps'(GlobalVariable.Username, GlobalVariable.Password)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Pengaturan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Setting/Pengaturan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/GantiPassword_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Setting/Ubah Password/GantiPassword_Text'), 0)

Mobile.verifyElementAttributeValue(findTestObject('AgreeMitra/Setting/Ubah Password/Simpan_Button'), 'clickable', 'false', 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.comment('Halaman Ganti Password')
//
//Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSaatini_Field'), 0)
//
//Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordBaru_Field'), 0)
//
//Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/KetikaUlang_Field'), 0)
//
//Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/Simpan_Button'), 0)
//
//Mobile.setText(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSaatini_Field'), password, 0)
//
//Mobile.setText(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordBaru_Field'), newPassword1, 0)
//
//Mobile.setText(findTestObject('AgreeMitra/Setting/Ubah Password/KetikaUlang_Field'), newPassword2, 0)
//
//Mobile.hideKeyboard()
//
//Mobile.delay(2)
//
//Mobile.comment('Password Saat ini Salah')
//
//if (password != 'rebahan') {
//    Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Simpan_Button'), 0)
//
//    Mobile.delay(2)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSalah_Popup'), 0)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//
//    Mobile.setText(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSaatini_Field'), 'rebahan', 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Simpan_Button'), 0)
//
//    Mobile.delay(2)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Berhasil_Popup'), 
//        0)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//} else if (newPassword2 != 'password') {
//    Mobile.tap(findTestObject('AgreeMitra/Setting/Ubah Password/KetikaUlang_Field'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSaatini_Field'), 0)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Setting/Ubah Password/Passwordtidaksama_Text'), 0)
//
//    Mobile.setText(findTestObject('AgreeMitra/Setting/Ubah Password/KetikaUlang_Field'), 'password', 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Setting/Ubah Password/KetikaUlang_Field'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Setting/Ubah Password/PasswordSaatini_Field'), 0)
//
//    Mobile.hideKeyboard()
//
//    Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Simpan_Button'), 0)
//
//    Mobile.delay(2)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Berhasil_Popup'), 
//        0)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//} else {
//    Mobile.hideKeyboard()
//
//    Mobile.delay(2)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Berhasil_Popup'), 
//        0)
//
//    Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//
//    Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)
//}
//
//not_run: CustomKeywords.'api_mitra.api.resetPasswordToDefault'()

