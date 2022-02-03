package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adobe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://account.magento.com/customer/account/create/");
	driver.findElement(By.id("firstname")).sendKeys("First");
	driver.findElement(By.id("lastname")).sendKeys("Last");
	driver.findElement(By.id("email_address")).sendKeys("myyesm@gmail.com");
	driver.findElement(By.id("self_defined_company")).sendKeys("YesMSystems");
	
	Select cp=new Select(driver.findElement(By.id("company_type")));
	
	cp.selectByValue("tech_partner");
	
	Select r1=new Select(driver.findElement(By.id("individual_role")));
	
	
	}

}
