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

WebUI.callTestCase(findTestCase('Mandiri/2. Farmer Data/Data Petani/Detail Profil/02. Detail Pasangan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Detail Bank', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/01. Edit - Work Detail'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/02. Pekerjaan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/03. Pekerjaan - PNS'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/08. Text Field - Alamat Kerja'), 'Jalan Kebon sirih', 
    0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/09. Bekerja Sejak'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/10. Bekerja Sejak - Lengkap'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/11. Cek list Bekerja Sejak'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/12. Text Field - Pendapatan per Bulan'), '3000000', 
    0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/13. Button - Simpan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Work Detail/14. Button - Ok Mantap'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

