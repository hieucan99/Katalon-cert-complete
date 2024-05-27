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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.takeScreenshotAsCheckpoint("view1")
WebUI.takeScreenshotAsCheckpoint("view2")
WebUI.takeScreenshotAsCheckpoint("view3")
WebUI.takeScreenshotAsCheckpoint("view4")
WebUI.takeScreenshotAsCheckpoint("view5")
WebUI.takeScreenshotAsCheckpoint("view6")
WebUI.takeScreenshotAsCheckpoint("view7")
WebUI.takeScreenshotAsCheckpoint("view8")
WebUI.takeScreenshotAsCheckpoint("view9")
WebUI.takeScreenshotAsCheckpoint("view10")
WebUI.takeScreenshotAsCheckpoint("view11")
WebUI.takeScreenshotAsCheckpoint("view12")
WebUI.takeScreenshotAsCheckpoint("view13")

WebUI.closeBrowser()
