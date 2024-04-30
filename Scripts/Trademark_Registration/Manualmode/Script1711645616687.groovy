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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tmbizfiledev.sos.ca.gov/Registration/')

WebUI.click(findTestObject('MAnualmodecapture/Page_Trademark Online Filing  California Secretary of State/button_START'))

WebUI.click(findTestObject('MAnualmodecapture/Page_TrademarkTrademark Online Filing  California Secretary of State/Radiobutton for Trademark'))

WebUI.click(findTestObject('MAnualmodecapture/Page_TrademarkTrademark Online Filing  California Secretary of State/Next1'))

WebUI.setText(findTestObject('MAnualmodecapture/Page_TrademarkTrademark Online Filing  California Secretary of State/input_Address selected will populate the address fields below_element6'), 
    '234')

WebUI.setText(findTestObject('MAnualmodecapture/Page_TrademarkTrademark Online Filing  California Secretary of State/input_City_element446'), 
    'folsom')

WebUI.closeBrowser()

