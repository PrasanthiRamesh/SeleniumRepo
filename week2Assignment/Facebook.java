package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		 
		 WebElement create = driver.findElement(By.linkText("Create New Account"));
		 create.click();
		 
		 
		 
		 WebElement namef = driver.findElement(By.name("firstname"));
		 namef.sendKeys("Test");
		 
		 WebElement namel = driver.findElement(By.name("lastname"));
		 namel.sendKeys("Test1");
		 
		 WebElement MN = driver.findElement(By.name("reg_email__"));
		 MN.sendKeys("Test1");
		 
		 WebElement password = driver.findElement(By.name("reg_passwd__"));
		 password.sendKeys("Test1@123");
		 
		 
		 WebElement day = driver.findElement(By.id("day"));
		 Select dd = new Select(day);
		 dd.selectByValue("3");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select dd1 = new Select(month);
		 dd1.selectByValue("7");
		 
		 WebElement year = driver.findElement(By.id("year"));
		 Select dd2 = new Select(year);
		 dd2.selectByValue("2014");
		 
		 WebElement radio = driver.findElement(By.name("sex"));
		 radio.click();
		 
		 
		 	}

}
