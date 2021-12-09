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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/BannerDaftarSekarang_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/BannerDaftarSekarang_Icon'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/BannerLengkapiDataDiri_Img'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/BannerLengkapiDataDiri_Img'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('masuk ke halaman lengkapi data diri')

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Unggah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Nama_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/NoHandphone_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/NIK_TextField'), 0)

Mobile.setText(findTestObject('AgreeModal/LengkapiDataDiri/NIK_TextField'), CustomKeywords.'abstraction.customKeyword.randomInt'(
        16), 0)

Mobile.comment('Format Email Salah')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Email_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Email_TextField'), 'rebahangmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.scrollToText('Kelurahan/Desa*')

Mobile.delay(0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Alamat_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Alamat_TextField'), 'Jalan Baru', 
    0)

Mobile.hideKeyboard()

not_run: Mobile.scrollToText('Foto kelengkapan Dokumen')

Mobile.comment('Provinsi')

not_run: Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Field'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Field'), 0)

not_run: Mobile.scrollToText('DKI Jakarta', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Text'), 0)

Mobile.comment('Kabupaten')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Field'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Text'), 0)

Mobile.comment('Kecamatan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Field'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Text'), 0)

Mobile.comment('Desa')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Text'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Dimana lokasi lahan utama Anda?', FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Upload Dokumen')

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Unggah_Text'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Unggah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Pilihdari_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kamera_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Silang')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Silang_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Silang_Button'), 0)

Mobile.comment('Ceklis')

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Ceklis_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Ceklis_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Ceklis')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Isi Kuisioner')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kuisioner_Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/KomoditasyangDimiliki_TextField'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/DimanaLokasi_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/KomoditasyangDimiliki_TextField'), 
    'Ea', 0)

Mobile.setText(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/DimanaLokasi_TextField'), 'Ea', 
    0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Info_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Format Email Benar')

Mobile.scrollToText('Foto diri', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Email_TextField'), 'rebahan1@gmail.com', 
    0)

not_run: Mobile.scrollToText('Simpan Perubahan')

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

