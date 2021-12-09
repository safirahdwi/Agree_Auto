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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Halo_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/NamaMitra_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/BannerDaftarSekarang_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Kalkulator_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/InfoCuaca_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/ArtikelPertanian_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Lihatsemua_Link'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Artikel_Banner'), 0)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/InfoCuaca_Icon'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/PilihLokasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/PilihLokasiSekarang_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/PilihLokasiManual_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/PilihLokasiManual_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/PilihLokasiManual_Text'), 
    0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/CariLokasi_TextField'), 0)

Mobile.comment('Fungsi Batalkan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/Batalkan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/LokasiTerakhir_Text'), 0)

Mobile.setText(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/CariLokasi_TextField'), 'Surabaya', 0)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/Batalkan_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/CariLokasi_TextField'), 0, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Fungsi cari lokasi')

Mobile.setText(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/CariLokasi_TextField'), 'Surabaya', 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/ListSuggest_Text_1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Pilih Lokasi Manual/ListSuggest_Text_1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/InfoCuaca_Text'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Back_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Edit_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/PerkiraanCuaca_Text'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Cuaca_Card'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(1200, 1500, 100, 1500)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Perkiraandalam_Text'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/ArahAngin_List'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Cuaca_List'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(400, 2300, 400, 2100)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Info Cuaca/ArahAngin_List'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AgreeMitra/Dashboard/Info Cuaca/ArahAngin_List'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Info cuaca')

Mobile.tap(findTestObject('AgreeMitra/Dashboard/Info Cuaca/Back_Button'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Beranda_Text'), 0, FailureHandling.STOP_ON_FAILURE)

