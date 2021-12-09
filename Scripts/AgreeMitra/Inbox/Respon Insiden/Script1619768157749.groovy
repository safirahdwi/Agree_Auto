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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Inbox_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/Inbox_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/ResponInsiden_Text'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/ResponInsiden_Text'), 0)

Mobile.scrollToText('Lampiran foto', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/LampiranFoto_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/LampiranFoto_Field'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/LampiranFoto_Field'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Silang_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/Silang_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Selesaiditangani_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/Selesaiditangani_Button'), 0)

Mobile.comment('Batalkan')

Mobile.verifyElementExist(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Silang_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Komentar_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/Komentar_TextField'), 0)

Mobile.tap(findTestObject('AgreeMitra/Kemitraan/Perusahaan/Pilih Perusahaan/Filter/Silang_Button'), 0)

Mobile.comment('Masuk lagi ke komentar')

Mobile.scrollToText('Lampiran foto', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AgreeMitra/Inbox/Selesaiditangani_Button'), 0)

Mobile.setText(findTestObject('AgreeMitra/Inbox/Komentar_TextField'), CustomKeywords.'abstraction.customKeyword.randomString'(
        257), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Inbox/KirimKomentar_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Inbox/KirimKomentar_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Berhasil_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.tap(findTestObject('AgreeMitra/Create Account/Oke_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

