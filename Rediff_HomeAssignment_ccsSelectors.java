package class_06November;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_HomeAssignment_ccsSelectors {
	public static WebDriver driver;

@BeforeTest
public void launchRediff() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
}

@Test
public void clickOnSignInLink() throws InterruptedException {
	driver.findElement(By.cssSelector("a[class = mailicon]")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Seleniump@123");
    driver.findElement(By.cssSelector("input.signinbtn")).click();
    Thread.sleep(2000);

	//driver.findElement(By.cssSelector(".vdicon")).click();
	//driver.navigate().back();
	
	/*
	 * driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
	 * driver.navigate().back();
	 */

}

@AfterTest
public void signout() {
	driver.quit();
	
}
}
