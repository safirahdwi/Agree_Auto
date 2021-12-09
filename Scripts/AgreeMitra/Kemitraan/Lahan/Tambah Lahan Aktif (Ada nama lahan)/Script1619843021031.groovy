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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/ListKomoditasSaya_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/PanahListKomoditasSaya_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/PanahListKomoditasSaya_Icon'), 0)

not_run: Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/LahanBesar_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/PanahListPetani_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/PanahListPetani_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/LahanAktifPetani_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/HistoryLahan_Icon'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/TambahLahanAktif_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/TambahLahanAktif_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/NamaLahanAktif_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/LuasLahan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/PanahSatuan_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/TambahDataLahan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/AlamatLahan_Field'), 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/NamaLahanAktif_TextField'), 'Coba1', 0)

Mobile.setText(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/LuasLahan_TextField'), '2', 0)

Mobile.hideKeyboard()

Mobile.doubleTap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/PanahSatuan_Icon'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Satuan_DropdownText'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Satuan_DropdownText'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/TambahLahanAktif_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/TambahDataLahan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Lahan Besar/Lahan Petani/Berhasilditambah_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

