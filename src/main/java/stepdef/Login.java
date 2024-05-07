package stepdef;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends baseClass{
	
		
	@Given("enter Username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.xpath("//input[contains(@name, 'USERNAME')]")).sendKeys(uname);
	}
	
	@Given("enter Password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.xpath("//input[contains(@name, 'PASSWORD')]")).sendKeys(pwd);
	}
	
	@When("Click on Login")
	public void clickonLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@And("The Home Page is Displayed")
	public void homePage() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title " + driver.getTitle());
	}
	
	
	
}
