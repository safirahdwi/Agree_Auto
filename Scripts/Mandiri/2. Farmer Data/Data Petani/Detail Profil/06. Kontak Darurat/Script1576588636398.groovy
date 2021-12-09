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

WebUI.callTestCase(findTestCase('Mandiri/2. Farmer Data/Data Petani/Detail Profil/05. Detail Bank'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('No. Kontak Darurat', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/01. Edit - Emergency Contact'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/02. Text Field - Nama kontak darurat'), 'Yuda', 
    0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/03. Text Field - Hubungan'), 'Kakak', 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/04. Text Field - No. Kontak Darurat'), '0875421345677', 
    0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/05. Button - Simpan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Emergency Contact/06. Button - Ok Mantap'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/00. Button - Back'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

