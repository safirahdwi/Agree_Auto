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

WebUI.callTestCase(findTestCase('Mandiri/2. Farmer Data/Data Petani/Detail Profil/01. Detail Keluarga'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/01. Edit - Spouse Detail'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/02. Text Field - Nama Pasangan'), 'Mamas', 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/03. Text Field - NIK'), '5684278965432123', 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/04. Pekerjaan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/06. Pekerjaan - BUMNBUMD'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/10. Text Field - Pendapatan Per Bulan'), '2000000', 
    0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/11. Tanggal Lahir'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/12. Tanggal Lahir - Lengkap'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/13. Cek list Tanggal Lahir'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/14. Text Field - Tempat Lahir'), 'Banten', 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/15. Button - Simpan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Spouse Detail/16. Button - Ok Mantap'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

