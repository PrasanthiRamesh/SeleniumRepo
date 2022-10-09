package week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
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
		
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		
		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("Softlabs");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Prasanthii");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Prasanthii");
		
		WebElement lastnamee=driver.findElement(By.id("createLeadForm_lastName"));
		lastnamee.sendKeys("Ram");
		
		WebElement ElementDescription=driver.findElement(By.id("createLeadForm_description"));
		ElementDescription.sendKeys("Testing");
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("santhi@gmail.com");
		
		WebElement elementCreateLeadClick = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadClick.click();
		
		WebElement elementEditLead = driver.findElement(By.linkText("Edit"));
		elementEditLead.click();
		//Clear Description Field
		
		WebElement ElementClearDescription=driver.findElement(By.id("updateLeadForm_description"));
		ElementClearDescription.clear();
		
		//WebElement companynameedit=driver.findElement(By.id("updateLeadForm_companyName"));
		//companynameedit.sendKeys("Company name Edited");
		
		
		
		WebElement importantnote=driver.findElement(By.id("updateLeadForm_description"));
		importantnote.sendKeys("Edit page important note for testing purpose");
		
		WebElement update = driver.findElement(By.className("smallSubmit"));
		update.click();
		
		System.out.println("The title is " + driver.getTitle());
		
		
	}

}
