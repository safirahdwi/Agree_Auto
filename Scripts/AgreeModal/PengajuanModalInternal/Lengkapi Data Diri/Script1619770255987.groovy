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

Mobile.startApplication(GlobalVariable.Path2, true)

CustomKeywords.'abstraction.customKeyword.logintoApps'(GlobalVariable.Username2, GlobalVariable.Password2)

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

Mobile.setText(findTestObject('AgreeModal/LengkapiDataDiri/NIK_TextField'), '1234560101910001', 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Email_TextField'), 0)

Mobile.scrollToText('Kelurahan/Desa', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Alamat_TextField'), 0)

Mobile.setText(findTestObject('AgreeModal/LengkapiDataDiri/Alamat_TextField'), 'Jalan', 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Provinsi_ListField'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Provinsi_ListField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Provinsi/Aceh_List'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Provinsi/Aceh_List'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/KabupatenKota_ListField'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/KabupatenKota_ListField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/KabupatenKota/AcehBarat_List'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/KabupatenKota/AcehBarat_List'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Kecamatan_ListField'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Kecamatan_ListField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Kecamatan/AronganLambalek_List'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Kecamatan/AronganLambalek_List'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/KelurahanDesa_ListField'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/KelurahanDesa_ListField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/KelurahanDesa/AlueBagok_List'), 0)

Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/KelurahanDesa/AlueBagok_List'), 0)

Mobile.scrollToText('Dimana lokasi lahan utama Anda?', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Unggah_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Komoditas_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Lokasi_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

not_run: Mobile.tap(findTestObject('AgreeModal/LengkapiDataDiri/Simpan_Text'), 0)

Mobile.comment('Kembali ke halaman langkah daftar kemitraan')

