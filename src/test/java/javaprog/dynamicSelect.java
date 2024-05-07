package javaprog;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@data-suggestion-index, '1')]"))).click();
        WebElement element = (driver.findElement(By.xpath("//li[contains(@data-suggestion-index, '1')]")));
        Select s = new Select(element);
        List<WebElement> a = s.getOptions();
        s.getAllSelectedOptions();
        
	}

}
