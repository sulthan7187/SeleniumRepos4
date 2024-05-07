package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class hooksClass extends baseClass {
     
	@Before
	public void launchBrowser() {
		driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@After
	public void clickonLogout(Scenario scene) {
		driver.findElement(By.xpath("//input[contains(@value, 'Logou')]")).click();
		if(scene.isFailed()) {
			final String screen = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BASE64);
			scene.attach(screen, "image/png", scene.getName());
		}
		System.out.println("Title " + (driver.getTitle()));
		driver.close();
	}
	
	

}
