package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.datareader;
import page.BasePage;
import page.HomePage;
import page.LoginPage;
import pojo.TestCase;


import reports.ExtentTestManager;


public class SamTest extends BasePage{

	LoginPage lp;
	HomePage hp;

	public SamTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initilization();
	}

	@DataProvider
	public Iterator<TestCase> getTestData() throws Exception, IOException {
		datareader object = new datareader();
		ArrayList<TestCase> testData = object.readExecl();
		return testData.iterator();
	}
	
	@Test(dataProvider ="getTestData")
	public void test01(TestCase testcase) throws Exception {
		
		ExtentTestManager.startTest(testcase.getTcID(), "TC01 Login Scenario .");
		
		lp = new LoginPage();
		hp = new HomePage();
		
		System.out.println("Test 123d");
		System.out.println(" Testcasse " + testcase.toString());
		System.out.println(" Testcasse " + testcase.getUserName());
		
		lp.sendusername(testcase.getUserName());
		lp.sendpassword(testcase.getPassword());
		lp.submit();
		
		if(testcase.getScenario().equals("positive")) {
		boolean bool = hp.isMenuIconExist();
		Assert.assertEquals(bool, true);
		}
		
		if(testcase.getScenario().equals("negative")) {
			boolean bool = lp.isErrorExists();
			Assert.assertEquals(bool, true);
			}
		Thread.sleep(2000);
	}
	
	@DataProvider
	public Iterator<TestCase> getreadTC02() throws Exception, IOException {
		datareader object = new datareader();
		ArrayList<TestCase> testData = object.readTC02();
		return testData.iterator();
	}
	
	@Test(dataProvider ="getreadTC02")
	public void test02(TestCase testcase) throws Exception {
		
		ExtentTestManager.startTest(testcase.getTcID(), " TC 02 Scenario .");
		
		lp = new LoginPage();
		hp = new HomePage();
		
		System.out.println("Test 123d");
		System.out.println(" Testcasse " + testcase.toString());
		System.out.println(" Testcasse " + testcase.getUserName());
		
		lp.sendusername(testcase.getFname());
		lp.sendpassword(testcase.getLname());
		lp.submit();
		
		
			boolean bool = lp.isErrorExists();
			Assert.assertEquals(bool, true);
			
		Thread.sleep(2000);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
		System.out.println(" 4444");
	}
}