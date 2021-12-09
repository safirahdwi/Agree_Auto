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

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/BannerJadiMitraPerusahaan_Img'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/BannerJadiMitraPerusahaan_Img'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Search_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Search_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/CariPerusahaan_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/CariPerusahaan_TextField'), 
    'B Trans Free', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/NamaPerusahaan_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Info_Button'), 0)

Mobile.doubleTap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Daftar_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/JadiMitra_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Jenis Kemitraan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Budidaya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Suling_Checkbox'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Buncis_Text'), 0)

Mobile.comment('Isi Data')

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Budidaya_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Suling_Checkbox'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Buncis_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Sudah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Belum_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Sudah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Komentar_TextField'), 0)

Mobile.setText(findTestObject('AgreeMitra/Inbox/Komentar_TextField'), CustomKeywords.'abstraction.customKeyword.randomInt'(
        255), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 0)

Mobile.comment('Edit Komoditas')

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Buncis_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Buncis_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Hapus_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Edit_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Edit_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Belum_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 0)

not_run: Mobile.scrollToText('Kode referral', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(1234, 328, 1234, 2079)

Mobile.comment('Unggah Dokumen')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/InformasiDokumenPendukung_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/InformasiDokumenPendukung_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Dokumen_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/Ok_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Unggahdokumenpendukung_Text'), 0)

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

Mobile.comment('Kode Referral')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/TidakbisaMendaftar_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/SayaSetuju_Checkbox'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.comment('Ada yang belum terisi')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Adaisiankosong_Popup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahanHarusDiisi_Text'), 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_TextField'), '100', 0)

not_run: Mobile.scrollToText('Kode referral', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(1329, 172, 1329, 2079)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Login/Adaisiankosong_Popup'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/KetentuandiCentang_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/SayaSetuju_Checkbox'), 0)

Mobile.comment('Kode Referral Tidak Tersedia')

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_TextField'), '12345678', 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/TidakbisaMendaftar_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Daftar/KodeReferral_TextField'), '12345678', 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Daftar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Konfirmasi_Popup'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Alamat Lahan Utama/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Berhasil_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

