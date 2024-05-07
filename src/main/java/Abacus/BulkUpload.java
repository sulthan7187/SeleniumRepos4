package Abacus;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BulkUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubtry {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("InPrivate");
		EdgeDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://abacusph-bpo-dm.ciostage.accenture.com/default.aspx");
		//driver.findElement(By.xpath("//input[contains(@type, 'email')]"))
		//.sendKeys("sulthan.a.allaudeen@ds.dev.accenture.com");
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(50));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'email')]")))
		.sendKeys("sulthan.a.allaudeen@ds.dev.accenture.com");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'submit')]"))).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'passwd')]"))).sendKeys("Sul$2023");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'submit')]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type, 'button')]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abacusph-bpo-dm.ciostage.accenture.com/login.aspx");
		driver.switchTo().frame("frmContents");
		/*driver.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abacusph-bpo-dm.ciostage.accenture.com/ResourceReqSearch.aspx");*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@id, 'TreeControl1_mtrvDsasListt13')]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement x = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Bulk Upload']")));
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		act.keyDown(Keys.CONTROL).moveToElement(x).click().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@role, 'combobox')])[2]"))).sendKeys("JR Location Details Update");
	    Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@role, 'combobox')])[2]"))).sendKeys("JR Location Details Update");
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@unselectable, 'on')])[2]"))).click();
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@name, 'btnImport')])[2]"))).click();
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@type, 'button')])[1]"))).click();
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@role, 'combobox')])[1]"))).sendKeys("JR Location Details Update");
	    Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@role, 'combobox')])[1]"))).sendKeys("JR Location Details Update");
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@unselectable, 'on')])[1]"))).click();
	   Thread.sleep(5000);
	   wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(@type, 'button')])[3]"))).click();
	   
	}

}
