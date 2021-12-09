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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Ubah_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Ubah_Text'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Bermitradengan_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Silang_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/ListBermitradengan_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/GantiPerusahaan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/DaftarKemitraanBaru_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/DaftarKemitraanBaru_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/PilihPerusahaan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Listperusahaan1_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Search_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Search_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/CariPerusahaan_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/CariPerusahaan_TextField'), 
    '1Modal', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/NamaPerusahaan_Card'), 
//    0)
Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Info_Button'), 0)

Mobile.doubleTap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Daftar_Button'), 0)

not_run: Mobile.tapAtPosition(1200, 600)

not_run: Mobile.tapAtPosition(1200, 600)

not_run: CustomKeywords.'abstraction.customKeyword.tap'(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Daftar_Button'))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/JadiMitra_Text'), 0)

Mobile.comment('Jenis Kemitraan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Jenis Kemitraan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Budidaya_Checkbox'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Budidaya_Checkbox'), 0)

Mobile.comment('Luas Lahan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_TextField'), '1000', 0)

Mobile.hideKeyboard()

Mobile.comment('Komoditas')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Komoditas_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Komoditas_Card'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Komoditas_Card'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Belum_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Sudah_Text'), 0)

Mobile.comment('Sudah')

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Sudah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/SudahadaTanaman_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Catatan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/Catatan_TextField'), CustomKeywords.'abstraction.customKeyword.randomInt'(
        255), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(50, 2100, 50, 200)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Unggah dokumen pendukung')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/InformasiDokumenPendukung_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/InformasiDokumenPendukung_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Dokumen_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/TambahDokumen_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/TambahDokumen_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Pilihdari_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Kamera_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Alamat Utama')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/AlamatLahanUtama_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/AlamatLahanUtama_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Alamat_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Provinsi_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Kabupaten_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Kecamatan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Desa_Field'), 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Alamat_TextField'), 'Jalan Impian', 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Provinsi_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Provinsi_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Kabupaten_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kabupaten_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Kecamatan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Kecamatan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Desa_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Daftar Kemitraan Pertama Kali/Lengkapi Data Diri/Desa_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/TambahkanAlamat_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/TambahkanAlamat_Button'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.comment('Pengajuan Modal')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/MengajukanModal_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.comment('Kode Referral')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_TextField'), 0)

Mobile.comment('Syarat dan Ketentuan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/SayaSetuju_Checkbox'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/SayaSetuju_Checkbox'), 0)

Mobile.comment('Daftar')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Ya_Button'), 0)

//Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Berhasil_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

