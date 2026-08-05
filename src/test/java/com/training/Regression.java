package com.training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Regression {

	ExtentReports extent;
	long start;
	long end;
	@BeforeClass
	public void init()
	{
		System.out.println("Testing started by "+Thread.currentThread());
		start=System.currentTimeMillis();
		extent = new ExtentReports();
		ExtentSparkReporter spark =new ExtentSparkReporter("reports/report.html");
		extent.attachReporter(spark);
	}
	
	@Test(groups = "regression")
//	@Test(groups = "regression",priority = 2,invocationCount = 10)
	public void regressionTetst1()
	{
		System.out.println("regression Testing 1 by "+Thread.currentThread());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ExtentTest test =extent.createTest("Regression Test 1");
		test.pass("Test successfull!");
	}
	@Test(groups = "regression",priority = 1)
	public void regressionTetst2()
	{
		System.out.println("regression Testing 2 by "+Thread.currentThread());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ExtentTest test =extent.createTest("Regression Test 2");
		test.fail("Test Failed 😢🥲!");
	}
	
	@AfterClass
	public void destroy()
	{
		System.out.println("Testing ended by "+Thread.currentThread());
		end=System.currentTimeMillis();
		System.out.println("Total Time Taken :"+(end-start)+"ms");
		extent.flush();
	}
}
