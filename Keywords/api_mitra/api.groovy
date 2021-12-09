package api_mitra

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable

public class api {
	def slurper = new groovy.json.JsonSlurper()

	@Keyword
	def resetPasswordToDefault() {
		// Call Login API
		def login = WS.sendRequest(findTestObject('Object Repository/AgreeMitra/API/Login'))
		def login_response = slurper.parseText(login.getResponseBodyContent())

		// Get token from login API
		def bearer_token = login_response.data.accessToken

		// Call reset password API
		def check_in_request = WS.sendRequest(findTestObject('Object Repository/AgreeMitra/API/ResetPassword', [('bearer_token'): (bearer_token)]))
	}
}