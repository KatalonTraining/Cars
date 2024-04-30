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

WebUI.callTestCase(findTestCase('Trademark_Registration/RecordMode_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Trademark_istpageobjects/input_Registration for_element70'))

WebUI.click(findTestObject('Object Repository/Trademark_istpageobjects/input_Trademark Frequently Asked Questions__b182ce'))

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Owner (Registrant)_element5'), 'Meenatestexample')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Street_element443'), '')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Owner (Registrant)_element5'), 'MeenatestMt')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Street_element443'), '3333')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_City_element446'), 'folsom')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Country_element444'), 'USA')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_State_element445'), 'CA')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_ZipPostal Code_element447'), '95630')

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_State_element445'), 'CA')

WebUI.click(findTestObject('Object Repository/Trademark_istpageobjects/input_Yes_element474'))

WebUI.setText(findTestObject('Object Repository/Trademark_istpageobjects/input_Acknowledgement of Declaration of Own_3e5904'), 
    'Meenatest')

WebUI.closeBrowser()

