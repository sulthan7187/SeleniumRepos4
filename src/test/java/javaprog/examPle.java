package javaprog;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class examPle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 5;
		 
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		}
	
		catch(Exception e) {
			e.getMessage();
		}
		
		
        // result holds max of three
        // numbers
        

	}

}


