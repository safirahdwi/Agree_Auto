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

Mobile.comment('Popup NonActive')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Non-Active Company/Perhatian_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.comment('Tap Ubah')

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
    'B Trans Free', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/NamaPerusahaan_Card'), 
//    0)
Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Cari Perusahaan/Perusahaantidakditemukan_Text'), 
    0)

