package Abacus;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		try {
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(15000);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(15));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id, 'fromCity')]"))).click();
		String s = "Mumbai";
		driver.findElement(By.xpath("//input[contains(@placeholder, 'From')]")).sendKeys("Mum");
		List<WebElement> a =  driver.findElements(By.xpath("//li[contains(@role, 'option')]"));
		
		for(WebElement b : a) {
			String c = b.getText();
			if(c.contains(s)) {
				b.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
			}
		}
			catch(Exception e) {
				File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//Files.(f, new File("C:\\TestLeaf\\SeleniumCucumber\\test-output\\Screenshots"));
				FileUtils.copyFile(f, new File(".//Screenshot/Sucfai.png"));
				System.out.println("this " + e.getMessage());
			}
				
			}
		
		

	}


