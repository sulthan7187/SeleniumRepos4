package inheritance;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class inheritClass extends VehClass {
	
	public void Browser() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	public void loadLink() {
		driver.findElement(By.xpath("//input[contains(@name, 'USERNAME')]")).sendKeys("CRMSFA");
	}
}
