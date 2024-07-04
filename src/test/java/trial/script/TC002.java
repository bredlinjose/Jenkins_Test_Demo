package trial.script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import trial.base.BaseTest;

public class TC002 extends BaseTest {
	
	String url = System.getProperty("user.dir")+"\\sample_website\\login.html";
	
	@Test
	public void checkingTheLinks() {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement lnkRegister = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		lnkRegister.click();
				
		WebElement lnkForgetPassowrd = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")); // changed
		lnkForgetPassowrd.click();
		
		WebElement tbEmail = driver.findElement(By.id("email"));
		tbEmail.sendKeys("xyz@yahoo.in");
		
		WebElement btnResetPassword = driver.findElement(By.xpath("//button[text()='Reset Password']"));
		btnResetPassword.click();
		
		String title = driver.getTitle();
		System.out.println("Title: "+ title);
	}
}
