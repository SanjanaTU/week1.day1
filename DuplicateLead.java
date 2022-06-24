package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		  WebElement usernameElement  = driver.findElement(By.id("username"));
	      usernameElement.sendKeys("Demosalesmanager");
	      
	      WebElement passwordElement= driver.findElement(By.name("PASSWORD"));
	      passwordElement.sendKeys("crmsfa");
	      
	      WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	      loginButton.click();
	      	      
	      WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
	      crmsfaElement.click(); 
	      
	      WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	      elementLeads.click(); 
	      
	      WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	      elementCreateLead.click();
	      
	      WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	      elementCompanyName.sendKeys("Amazon");
	      
	      WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	      elementFirstName.sendKeys("Sanjana");
	      
	      WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	      elementLastName.sendKeys("U");
	      
	      WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	      elementFirstNameLocal.sendKeys("san");
    
	      WebElement elementDepartmentName = driver.findElement(By.name("departmentName"));
	      elementDepartmentName.sendKeys("Information Technology");
    
	      WebElement elementDescription = driver.findElement(By.name("description"));
	      elementDescription.sendKeys("IT");
     
	      WebElement elementPrimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
	      elementPrimaryEmail.sendKeys("sanjana02@gmail.com");
	      
	      WebElement elementGeneralState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	      Select dd = new Select(elementGeneralState);
		  dd.selectByVisibleText("New York");
		  
		  String title = driver.getTitle();
	      System.out.println("The title is :"+ title);
		  
		  WebElement elementLead = driver.findElement(By.name("submitButton"));
	      elementLead.click();
	      	         
	      WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
	      elementDuplicateLead.click();
	      
	      WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
	      companyName.clear();
	      companyName.sendKeys("HP");
	      
	      WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	      firstName.clear();
	      firstName.sendKeys("Jhanvi");
	      
	      WebElement elementCLead = driver.findElement(By.name("submitButton"));
	      elementCLead.click();
	      
	      String title1 = driver.getTitle();
	      System.out.println("The title is :"+ title1);
	   	      
	}
}
