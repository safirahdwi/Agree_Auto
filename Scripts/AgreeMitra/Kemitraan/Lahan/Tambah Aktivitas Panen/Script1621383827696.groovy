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

not_run: Mobile.startApplication(GlobalVariable.Path, true)

not_run: CustomKeywords.'abstraction.customKeyword.logintoApps'(GlobalVariable.Username, GlobalVariable.Password)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

not_run: Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Kemitraan_Text'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/PengajuanLahanBaru_Card'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/KomoditasSaya_Text'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Ubah_Text'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/ListKomoditasSaya_Card'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/PanahListKomoditasSaya_Icon'), 0)

not_run: Mobile.tap(findTestObject('AgreeMitra/Kemitraan/PanahListKomoditasSaya_Icon'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/LahanBesar_Text'), 0)

WebUI.callTestCase(findTestCase('AgreeMitra/Kemitraan/Screen Kemitraan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/PanahListPetani_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/PanahListPetani_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/LahanAktifPetani_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/LahanAktif_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/LahanAktif_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/DetailLahan_Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/TambahAktivitas_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/TambahAktivitas_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/TambahAktivitas_Popup'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/Panen_Text'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/Panen_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanggal_TextField'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/PopulasiSaatIni_TextField'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/Produksi_TextField'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Daftar/Ya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/Pendaftaran/Tidak_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/AdaPanenatauTidak_Text'), 
    0)

Mobile.comment('Field Tanggal')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanggal_TextField'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanggal_TextField'), 0)

CustomKeywords.'abstraction.customKeyword.setDateTextField'('Apr', '05', '2021')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/OK_Button_2'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Tanam/OK_Button_2'), 0)

Mobile.comment('Populasi saat ini')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/PopulasiSaatIni_TextField'), 
    0)

not_run: Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/PopulasiSaatIni_TextField'), 
    '1000,02', 0)

Mobile.comment('Produksi')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/Produksi_TextField'), 
    0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Panen/Produksi_TextField'), 
    '1000,98', 0)

Mobile.comment('Biaya')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Pemangkasan/Biaya_TextField'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Pemangkasan/Biaya_TextField'), 
    '1000', 0)

Mobile.hideKeyboard()

Mobile.comment('Apa ada aktivitas panen?')

Mobile.tap(findTestObject('AgreeMitra/Create Account/Tidak_Button'), 0)

Mobile.comment('Upload Gambar [1]')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan1_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan1_Button'), 
    0)

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

Mobile.comment('Upload Gambar [2]')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan2_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan2_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Upload Gambar [3]')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan3_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan3_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Upload Gambar [4]')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan4_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan4_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Upload Gambar [5]')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan5_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Perawatan/Penyemprotan,Penyiraman,Penyulaman,Taksasi/UploadGambarPerawatan5_Button'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Profile/Edit Profile/Galeri_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Aktivitas Petani/Pratanam/Pemupukan, Pengolahan Lahan/Gambar_Icon'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Simpan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Simpan_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Simpan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Profile/Edit Profile/BerhasildiSimpan_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2)

