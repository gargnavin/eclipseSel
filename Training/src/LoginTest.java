import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("email@email");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		System.out.println("Test");

	}

}
