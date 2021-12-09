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

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Profil_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Halo_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/NamaMitra_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/BannerDaftarSekarang_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Kalkulator_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/InfoCuaca_Icon'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/ArtikelPertanian_Text'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Lihatsemua_Link'), 0)

Mobile.verifyElementExist(findTestObject('AgreeMitra/Dashboard/Artikel_Banner'), 0)

Mobile.swipe(1000, 1500, 500, 1500)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

