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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/PengajuanLahanBaru_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/KomoditasSaya_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/PengajuanLahanBaru_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/PengajuanLahanBaru_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/TotalLuasLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/RealisasiTanam_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/AjukanLahanBaru_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/AjukanLahanBaru_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/PengajuanLahanBaru_Text'), 
    0)

Mobile.comment('Jenis Kemitraan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/JenisKemitraan_Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/JenisKemitraan_Checkbox'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/JenisKemitraan2_Checkbox'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/JenisKemitraan_Checkbox'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/JenisKemitraan2_Checkbox'), 
    0)

Mobile.comment('Luas Lahan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/LuasLahan_Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/LuasLahan_TextField'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Satuan_Field'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/LuasLahan_TextField'), 
    '100', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Satuan_Field'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Satuan_FieldText'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Satuan_FieldText'), 0)

Mobile.comment('Komoditas')

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Komoditas - Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Komoditas - CheckBox'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Komoditas - CheckBox'), 0)

Mobile.comment('Alamat')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/AlamatLahan_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/AlamatLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/AlamatLahan_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/AlamatLahan_TextField'), 
    'Jalan kebagusan', 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Provinsi_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Provinsi_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Provinsi_TextField'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Provinsi_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kabupaten_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kabupaten_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kabupaten_TextField'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kabupaten_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kecamatan_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kecamatan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kecamatan_TextField'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Kecamatan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Desa_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Desa_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Desa_TextField'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Desa_TextField'), 0)

not_run: Mobile.scrollToText('Ajukan', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.delay(2)

not_run: Mobile.swipe(40, 2000, 40, 800)

not_run: Mobile.delay(2)

Mobile.comment('Tambah alamat')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/TambahkanAlamat_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/TambahkanAlamat_Button'), 0)

Mobile.comment('Tidak')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Ajukan_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Ajukan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Tidak_Button'), 0)

Mobile.comment('Ya')

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Ajukan_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/Form Pengajuan Lahan Baru/Berhasil_Popup'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

