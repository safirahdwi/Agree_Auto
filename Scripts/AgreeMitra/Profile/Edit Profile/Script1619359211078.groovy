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

CustomKeywords.'abstraction.customKeyword.logintoApps'(GlobalVariable.Username, GlobalVariable.Password)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Profil_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/Profil_Icon'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Profil Saya/ProfileSaya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Profil Saya/IconEdit_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Profil Saya/IconEdit_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/EditProfil_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Image_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/UnggahLagi_Link'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/UnggahLagi_Link'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Pilihdari_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kamera_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Silang_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Silang_Button'), 0)

Mobile.comment('Isi data')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Nama_TextField'), 0)

not_run: Mobile.setText(findTestObject('AgreeMitra/Profile/Edit Profile/Nama_TextField'), '', 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Create Account/NoHandphone_TextField'), '08' + CustomKeywords.'abstraction.customKeyword.randomInt'(
        10), 0)

Mobile.comment('Format Email Salah')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Email_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Profile/Edit Profile/Email_TextField'), 'rebahangmail.com', 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Alamat_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Profile/Edit Profile/Alamat_TextField'), 'Jalan Baru', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Simpan Perubahan')

Mobile.comment('Provinsi')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Provinsi_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Provinsi_Field'), 0)

Mobile.delay(2)

Mobile.scrollToText('DKI Jakarta', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Provinsi_DropdownText'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Provinsi_DropdownText'), 0)

Mobile.comment('Kabupaten')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kabupaten_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Kabupaten_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kabupaten_DropdownText'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Kabupaten_DropdownText'), 0)

Mobile.comment('Kecamatan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kecamatan_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Kecamatan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kecamatan_DropdownText'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Kecamatan_DropdownText'), 0)

Mobile.comment('Desa')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Desa_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Desa_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Desa_DropdownText'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Desa_DropdownText'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/SimpanPerubahan_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/SimpanPerubahan_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Info_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Format Email Benar')

Mobile.scrollToText('Email', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('AgreeMitra/Profile/Edit Profile/Email_TextField'), 'rebahan1@gmail.com', 0)

Mobile.scrollToText('Simpan Perubahan')

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/SimpanPerubahan_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/BerhasildiSimpan_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

