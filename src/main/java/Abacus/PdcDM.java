package Abacus;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PdcDM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		EdgeDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://indaodm1.ciostage.accenture.com/default.aspx");
		//driver.findElement(By.xpath("//input[contains(@type, 'email')]"))
		//.sendKeys("sulthan.a.allaudeen@ds.dev.accenture.com");
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'email')]")))
		.sendKeys("sulthan.a.allaudeen@ds.dev.accenture.com");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'submit')]"))).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'passwd')]"))).sendKeys("Sul$2023");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'submit')]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'button')]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abacusph-bpo-dm.ciostage.accenture.com/login.aspx");
		driver.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abacusph-bpo-dm.ciostage.accenture.com/ResourceReqSearch.aspx");
		driver.findElement(By.xpath("//input[contains(@name, 'txtRRDNo')]")).sendKeys("R123317");
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		Thread.sleep(2000);
		driver.executeScript("window.scroll(0,550)");
		Thread.sleep(2000);
		
		 String a = driver.getWindowHandle();
		 driver.findElement(By.xpath("//a[contains(@id, 'dtgResourceReqSearchResult_ctl03_lbtdtgResourceReqName')]")).click();
		 Set<String> b = driver.getWindowHandles();
		 for(String c : b) {
			 driver.switchTo().window(c);
			 if(driver.getTitle().equals("Resource Requirement")) {
				 driver.manage().window().maximize();
				 driver.executeScript("window.scroll(0,1550)");
				 Thread.sleep(2000);
				 String d = driver.getWindowHandle();	 
		 driver.findElement(By.xpath("//input[contains(@value, 'View/Add/Edit/Approve Resource Count')]")).click();
			 Set<String> f = driver.getWindowHandles();
			 for(String e:f) {
				 driver.switchTo().window(e);
				 if(driver.getTitle().equals("Demand Approval")) {
					 driver.manage().window().maximize(); 
					 Thread.sleep(2000);
					 driver.executeScript("window.scroll(0,1550)");
					 Thread.sleep(2000);
					 driver.executeScript("window.scroll(1550,0)");
					 Thread.sleep(2000);
					 File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						//Files.(f, new File("C:\\TestLeaf\\SeleniumCucumber\\test-output\\Screenshots"));
						FileUtils.copyFile(f1, new File(".//Screenshots/Sucfai.png"));
						
					 driver.close();
					 Thread.sleep(2000);
					 driver.switchTo().window(c);
					 driver.close();
					 driver.switchTo().window(a);
					 Thread.sleep(2000);
					 driver.close();
					 
					 Thread.sleep(2000);
					 driver.close();
				 }
			 }
			
			
			 }
		 }
		}
		catch(Exception e){
			e.getMessage();
			System.out.println("this "+e);
		}
		

	}

}
