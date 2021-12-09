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

WebUI.callTestCase(findTestCase('Mandiri/1. Login/Login Akun Mandiri'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8)

not_run: Mobile.waitForElementPresent(findTestObject('2. Farmer Data/01. Button - Farmer Data'), 0)

Mobile.tap(findTestObject('2. Farmer Data/01. Button - Farmer Data'), 0)

Mobile.delay(8)

not_run: Mobile.waitForElementPresent(findTestObject('2. Farmer Data/02. Button - Create Farmer'), 0)

Mobile.tap(findTestObject('2. Farmer Data/02. Button - Create Farmer'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('2. Farmer Data/03. Text Field - Input Farmer Name'), 'TestQA Dini', 0)

Mobile.setText(findTestObject('2. Farmer Data/04. Text Field - Input NIK'), '3452178960543738', 0)

Mobile.tap(findTestObject('2. Farmer Data/05. Radio button - Input Gender'), 0)

Mobile.scrollToText('No. Handphone', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/06. Tanggal Lahir'), 0)

Mobile.tap(findTestObject('2. Farmer Data/07. Tanggal Lahir - Lengkap'), 0)

Mobile.tap(findTestObject('2. Farmer Data/08. Button - Ceklis Tanggal Lahir'), 0)

Mobile.setText(findTestObject('2. Farmer Data/09. Text Field - Tempat Lahir'), 'Semarang', 0)

Mobile.tap(findTestObject('2. Farmer Data/10. Button - Education'), 0)

Mobile.tap(findTestObject('2. Farmer Data/11. Button - Education SMA'), 0)

Mobile.setText(findTestObject('2. Farmer Data/12. Text Field - No. Handphone'), '08647642544443', 0)

Mobile.tap(findTestObject('2. Farmer Data/13. Button - Add Farmer'), 0)

Mobile.tap(findTestObject('2. Farmer Data/Button - Ok'), 0)

Mobile.delay(5)

