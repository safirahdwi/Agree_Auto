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

WebUI.callTestCase(findTestCase('Mandiri/2. Farmer Data/Data Petani/Detail Profil/04. Detail Pekerjaan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Kontak Darurat', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/01. Edit - Bank Detail'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/02. Text Field - nama Bank'), 'Mandiri', 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/03. Text Field - no. rekening petani'), '6532487644', 
    0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/04. Button - Simpan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Bank Detail/05. Button - Ok Mantap'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

