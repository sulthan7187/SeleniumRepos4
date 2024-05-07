package InterviewProg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		//driver.get("//table[contains(@id, 'indicesTable')]");
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement a = driver.findElement(By.xpath("//table[contains(@id, 'indicesTable')]//tr[5]//td[4]"));
		double b = -13.55;
		
		 if(a.equals(b)) {
			 
			System.out.println("The Value is " + b);
		}
	}

}
