
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize



def static "testing.Page_Start.access"() {
    (new testing.Page_Start()).access()
}


def static "testing.Page_End.end"() {
    (new testing.Page_End()).end()
}


def static "testing.Page_Form.click_Form"() {
    (new testing.Page_Form()).click_Form()
}


def static "testing.Page_Form.enterValue"(
    	String fName_value	
     , 	String lName_value	
     , 	String email_value	
     , 	String gender_value	
     , 	String mobile_value	
     , 	String year_value	
     , 	String month_value	
     , 	String subject_value	
     , 	String hobbies_value	
     , 	String upload_value	
     , 	String address_value	
     , 	String state_value	
     , 	String city_value	) {
    (new testing.Page_Form()).enterValue(
        	fName_value
         , 	lName_value
         , 	email_value
         , 	gender_value
         , 	mobile_value
         , 	year_value
         , 	month_value
         , 	subject_value
         , 	hobbies_value
         , 	upload_value
         , 	address_value
         , 	state_value
         , 	city_value)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}
