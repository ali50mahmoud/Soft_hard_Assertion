package soft_hard;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class first_soft_hard {
	ChromeDriver mydriver;
	SoftAssert soft;
	@Test
	public void hard_asser_testcase() {
		mydriver.findElement(By.name("user name")).sendKeys("loly");
		mydriver.findElement(By.name("password")).sendKeys("33445566");
		mydriver.findElement(By.name("submit")).click();
		Assert.assertEquals(true, false);
		mydriver.findElementByLinkText("submit").click();



	}


	@Test
	public void soft_assert_testcase() {
		mydriver.findElement(By.name("user name")).sendKeys("loly");
		mydriver.findElement(By.name("password")).sendKeys("33445566");
		mydriver.findElement(By.name("submit")).click();
		soft = new SoftAssert();

	}

	@BeforeMethod
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		mydriver = new ChromeDriver();
		mydriver.get("http://demo.guru99.com/test/newtours/index.php");
		mydriver.manage().window().maximize();

	}

	@AfterMethod
	public void close_browser() {
		//mydriver.close();
	}

}


