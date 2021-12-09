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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Suling_Checkbox'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Budidaya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Supplier_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/BudidayaDanSuling_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/LuasLahan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Field'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Satuan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Komoditas1_Button'), 0)

Mobile.scrollToText('Kode referral', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Unggahdokumenpendukung_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/TambahDokumen_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/InformasiDokumenPendukung_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/AlamatLahanUtama_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Ya_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Ya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Bersedia_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/Bersedia_Button'), 0)

Mobile.comment('masuk ke halaman list paket pinjaman')

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Arrow_Img'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Paket1_Img'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter_Button'), 0)

Mobile.comment('masuk ke halaman filter list paket pinjaman')

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/X_Img'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Reset_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Bank_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Bunga_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Periode_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Tampilkan_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Filter/Tampilkan_Button'), 0)

Mobile.comment('kembali ke halaman list paket pinjaman')

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/Paket1_Img'), 0)

Mobile.comment('masuk ke detail pinjaman')

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/DetailPinjaman/Pilih_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/ListPaketPinjaman/DetailPinjaman/Pilih_Button'), 0)

Mobile.comment('masuk ke halaman lengkapi data')

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/LengkapiData/AjukanModal_Button'), 0)

Mobile.tap(findTestObject('AgreeModal/Pendaftaran/LengkapiData/AjukanModal_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Ya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Tidak_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Daftar/Ya_Text'), 0)

Mobile.comment('kembali ke halaman pendaftaran kemitraan')

