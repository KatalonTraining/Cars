import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common_steps'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Registration for_element70'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Trademark Frequently Asked Questions__b182ce'))

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Owner (Registrant)_element5'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/Street'), '3333')

WebUI.click(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/Street'))

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_City_element446'), 
    'sacramento')

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Country_element444'), 
    'usa')

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_State_element445'), 
    'ca')

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/Zipcode'), '95630')

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_State_element445'), 
    'ca')

WebUI.click(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Are you an Authorized Representative _eb3a83'))

WebUI.setText(findTestObject('Object Repository/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_Name of Authorized Representative_element526'), 
    'dhsdjkhsjkd')

WebUI.closeBrowser()

