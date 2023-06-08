package Listener;

import java.io.*;
import org.openqa.selenium.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;



public class TestListener implements ITestListener {

	public String getClassName(ITestContext iTestContext) {
		// TODO Auto-generated method stub
		return iTestContext.getCurrentXmlTest().getClasses().stream().findFirst().get().getName();
	}

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
		String aa = result.getMethod().getDescription();
		ExtentTestManager.getTest().log(Status.INFO, String.format("<b style=\"color:#000080; font-size:18px;\">Test Description: " + aa+"</b>"));
	}

	public void onTestSuccess(ITestResult result) {

				ITestContext context = result.getTestContext();
		         WebDriver driver = null;
		         driver = (WebDriver) context.getAttribute("WebDriver");
				String targetLocation = null;

				String testClassName = getTestClassName(result.getInstanceName()).trim();
				String testMethodName = result.getName().toString().trim();
				String screenShotName = testMethodName  + ".png";
				String fileSeperator = System.getProperty("file.separator");
				String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
						+ "screenshots-pass";
				try {
					File file = new File(reportsPath + fileSeperator + testClassName); // Set
																						// screenshots
																						// folder
					if (!file.exists()) {
						if (file.mkdirs()) {
						} else {
						}

					}

					File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					targetLocation = reportsPath + fileSeperator + testClassName + fileSeperator + screenShotName;// define
																													// location
					File targetFile = new File(targetLocation);
					FileHandler.copy(screenshotFile, targetFile);

				} catch (FileNotFoundException e) {
				} catch (Exception e) {
				}

				// attach screenshots to report
				try {
					ExtentTestManager.getTest().pass("Screenshot",
							MediaEntityBuilder.createScreenCaptureFromPath(targetLocation).build());
				} catch (IOException e) {
	
				}
				ExtentTestManager.getTest().log(Status.PASS, "Test Pass");

	}

	public void onTestFailure(ITestResult result) {
		
		ITestContext context = result.getTestContext();
		
         WebDriver driver = null;
         driver = (WebDriver) context.getAttribute("WebDriver");
		String targetLocation = null;

		String testClassName = getTestClassName(result.getInstanceName()).trim();
		String testMethodName = result.getName().toString().trim();
		String screenShotName = testMethodName  + ".png";
		String fileSeperator = System.getProperty("file.separator");
		String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
				+ "screenshots-fail";
		try {
			File file = new File(reportsPath + fileSeperator + testClassName); // Set
																				// screenshots
																				// folder
			if (!file.exists()) {
				if (file.mkdirs()) {
					
				} else {
					
				}

			}

			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			targetLocation = reportsPath + fileSeperator + testClassName + fileSeperator + screenShotName;// define
																											// location
			File targetFile = new File(targetLocation);
			
			FileHandler.copy(screenshotFile, targetFile);

		} catch (FileNotFoundException e) {
			
		} catch (Exception e) {
			
		}

		// attach screenshots to report
		try {
			
			ExtentTestManager.getTest().log(Status.FAIL, "Failed Case is: " + result.getName());
           
			ExtentTestManager.getTest().fail("Screenshot",
					MediaEntityBuilder.createScreenCaptureFromPath(targetLocation).build());
			 
			 ExtentTestManager.getTest().log(Status.FAIL, result.getName()+" FAIL with error " + result.getThrowable());
	            
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
	}

	
	public String getTestClassName(String testName) {
	// TODO Auto-generated method stub
		String[] reqTestClassname = testName.split("\\.");
		int i = reqTestClassname.length -1;
		System.out.println("Required Test Name : " + reqTestClassname[i]);
	return reqTestClassname[i];
}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

}

