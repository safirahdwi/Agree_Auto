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

Mobile.comment('Pengajuan Lahan Baru')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/PengajuanLahanBaru_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/KomoditasSaya_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/PengajuanLahanBaru_Card'), 0)

Mobile.comment('Popup NonActive')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Non-Active Company/Perhatian_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.comment('Button Pengajuan Lahan Baru')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/PengajuanLahanBaru_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/TotalLuasLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/RealisasiTanam_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/AjukanLahanBaru_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/AjukanLahanBaru_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Popup NonActive')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Non-Active Company/Perhatian_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.comment('Card Pengajuan Lahan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Card'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Pengajuan Lahan Baru/ListPengajuanLahan_Card'), 0)

Mobile.comment('Popup NonActive')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Non-Active Company/Perhatian_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

