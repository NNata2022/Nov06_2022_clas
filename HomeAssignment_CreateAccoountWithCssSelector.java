package class_06November;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment_CreateAccoountWithCssSelector {

	public static ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
}
	@Test
	public void createaccount() throws InterruptedException {
		//driver.findElement(By.cssSelector("a[id=u_0_0_Ez]")).click();
		driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		//input[id=u_g_b_IH]
		driver.findElement(By.cssSelector("input[name = firstname]")).sendKeys("Nataliia");
		driver.findElement(By.cssSelector("input[name = lastname]")).sendKeys("Nagula");
		//input[name=reg_email__]
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("2223336666");
		driver.findElement(By.cssSelector("input[id=password_step_input]")).sendKeys("Qazxsw159");
	}
}
