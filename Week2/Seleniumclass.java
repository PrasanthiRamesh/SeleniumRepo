package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver=new EdgeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		// driver.close();
		 WebElement elementusername = driver.findElement(By.id("username"));
		 elementusername.sendKeys("Demosalesmanager");
		 
		 WebElement elementpassword = driver.findElement(By.id("password"));
		 elementpassword.sendKeys("crmsfa");
		 
		 WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		 elementlogin.click();
		 
		WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		//WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		//createlead.click();
		
		WebElement companyname = driver.findElement(By.id("ext-gen499"));
		companyname.sendKeys("Testleaf");
		
		WebElement firstname = driver.findElement(By.id("ext-gen501"));
		firstname.sendKeys("Prasanthi");
		 
		WebElement Lastname = driver.findElement(By.id("ext-gen503"));
		Lastname.sendKeys("Ramesh");
		
		WebElement countrycode = driver.findElement(By.id("ext-gen511"));
		countrycode.sendKeys("91");
		
		WebElement Number = driver.findElement(By.id("ext-gen519"));
		Number.sendKeys("9597543232");
		
		WebElement Email = driver.findElement(By.id("ext-gen529"));
		Email.sendKeys("prasanthi@gmail.com");
		
		
				
		WebElement lead = driver.findElement(By.id("ext-gen545"));
		lead.click();
		
		System.out.println("The title is " + driver.getTitle());
		
		
	}

}
