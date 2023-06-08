package Test_Project.Test_Project;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
		import org.testng.ITestContext;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;
		import io.github.bonigarcia.wdm.WebDriverManager;
		import Test_Project.Test_Project.Home1;
		import Test_Project.Test_Project.CityGIS;
		import Test_Project.Test_Project.Login;

		public class Home1 {
			WebDriver driver;
			@BeforeMethod
			  public void openBrowser(ITestContext context) throws InterruptedException {
				ChromeOptions ssl=new ChromeOptions();
				//ssl.addArguments("start-maximized");
				//ssl.addArguments("headless");
				ssl.setAcceptInsecureCerts(false);
				//  ssl.setAcceptInsecureCerts(false);
				//  ssl.setHeadless(true);
				 WebDriverManager.chromedriver().setup();
				  driver = new ChromeDriver(ssl);
				  context.setAttribute("WebDriver", driver);
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  driver.manage().window().maximize();
				 driver.get("https://coremodule.sgligis.com/");
				  Thread.sleep(2000);
				  Thread.sleep(3000);			  
				  }
			
		@AfterMethod
		public void afterMethod() 
		{
			 driver.quit();
		}
				
		@Test
		public void Test1() throws InterruptedException
		{			
			//System.out.println("Window Handle"+driver.getWindowHandle());
			//System.out.println("Page Source"+driver.getPageSource());
			 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        try {
		            FileUtils.copyFile(screenshotFile, new File("D:\\screenshot.png"));
		            System.out.println("Screenshot saved successfully!");
		        } catch (IOException  e) {
		            e.printStackTrace();
		        }
			
			driver.findElement(By.partialLinkText("Login")).click();
			driver.findElement(By.id("LoginInput_UserNameOrEmailAddress")).sendKeys("admin");
			driver.findElement(By.id("LoginInput_Password")).sendKeys("1q2w3E*");
			driver.findElement(By.xpath("//button[@value='Login']")).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;			
			js.executeScript("SGLQueryBuilder.Open({})");
			Thread.sleep(2000);
			//driver.findElement(By.id("defaultLayer")).sendKeys("ABD Boundary");
			Select select=new Select(driver.findElement(By.id("defaultLayer")));
			Thread.sleep(1000);
			select.selectByValue("boundary_amc");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Show Result']")).click();
			//driver.
			Thread.sleep(2000);	
			
			
		}		
		
		}
		

