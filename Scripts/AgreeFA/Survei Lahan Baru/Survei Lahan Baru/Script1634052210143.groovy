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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

for (int i = 0 ; i < 30 ; i++)
{

Mobile.startApplication(GlobalVariable.Path3, true)

CustomKeywords.'abstraction.customKeyword.logintoAppsFA'(GlobalVariable.Username3, GlobalVariable.Password3)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/ListMitraTerdaftar_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/ListMitraTerdaftar_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/NamaMitra_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/NamaMitra_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/PengajuanLahanBaru_Card'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/PengajuanLahanBaru_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/BelumSurvei_Card'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/BelumSurvei_Card'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/TambahLahan_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/TambahLahan_Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/InputDataLahan_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Petani_Field'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Petani_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/NamaPetani_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/NamaPetani_Text'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/LuasLahan_TextField'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/JarakJalanUtama_TextField'), 0)

Mobile.setText(findTestObject('AgreeFA/Survei Lahan Baru/LuasLahan_TextField'), '10', 0)

Mobile.setText(findTestObject('AgreeFA/Survei Lahan Baru/JarakJalanUtama_TextField'), '1', 0)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Iya_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Iya_Text'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(70, 2000, 70, 1030)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/RekomendasiKomoditas_Field'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/RekomendasiKomoditas_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Buncis_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Buncis_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/LongLat_Field'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/LongLat_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/PinPoin_Text'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/PinPoin_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Lewati_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Lewati_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Pasang_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Simpan_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Pasang_Button'), 0)

Mobile.doubleTap(findTestObject('AgreeFA/Survei Lahan Baru/Pasang_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Simpan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Sesuai_Card'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Sesuai_Card'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Simpan_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Simpan_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Ya_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Ya_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Survei Lahan Baru/Ya_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Survei Lahan Baru/Ya_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

}
