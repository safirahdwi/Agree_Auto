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

Mobile.startApplication(GlobalVariable.Path3, true)

CustomKeywords.'abstraction.customKeyword.logintoAppsFA'(GlobalVariable.Username3, GlobalVariable.Password3)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Point_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Beranda/Redeem Point/Point_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

def point1 = Mobile.getText(findTestObject('AgreeFA/Beranda/Redeem Point/PointSaya_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Tukar_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Beranda/Redeem Point/Tukar_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Konfirmasi_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Ya_Button'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Tidak_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Beranda/Redeem Point/Ya_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Berhasil_Popup'), 0)

Mobile.verifyElementExist(findTestObject('AgreeFA/Beranda/Redeem Point/Ok_Button'), 0)

Mobile.tap(findTestObject('AgreeFA/Beranda/Redeem Point/Ok_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(10, 850, 10, 1500)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

def point2 = Mobile.getText(findTestObject('AgreeFA/Beranda/Redeem Point/PointSaya_Text'), 0)

Mobile.verifyGreaterThan(point1, point2)

