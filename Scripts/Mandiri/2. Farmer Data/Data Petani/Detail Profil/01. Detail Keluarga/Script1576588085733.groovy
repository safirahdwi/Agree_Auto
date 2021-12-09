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

WebUI.callTestCase(findTestCase('Mandiri/2. Farmer Data/Data Petani/Create Farmer Data'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/01. Edit - Family Detail'), 0)

Mobile.setText(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/02. Text Field - Mother Name'), 'Anita', 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/03. Button - Plus'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/03. Button - Plus'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/05. Status Perkawinan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/07. Status Perkawinan - Menikah'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/10. Button - Simpan'), 0)

Mobile.tap(findTestObject('2. Farmer Data/00. Profile Detail/Family Detail/11. Button - Ok Mantap'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

