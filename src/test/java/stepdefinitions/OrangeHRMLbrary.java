  package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMLbrary 
{
	public static WebDriver driver;
	String empno;
	@Given("^I open browser with url \"([^\"]*)\"$")
	public void launchApp(String url) throws Throwable 
	{
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
	
	    
	}

	@Then("^i should see login page$")
	public void i_should_see_login_page() throws Throwable 
	{
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			System.out.println("System Display login Page");
		}
	    
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uname) throws Throwable 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	    
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pword) throws Throwable 
	{
	  driver.findElement(By.id("txtPassword")).sendKeys(pword);
		
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable 
	{
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() throws Throwable 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			System.out.println("Admin Login is Succesfully");
		}
	    
	}

	@When("^i click logout$")
	public void i_click_logout() throws Throwable 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	   
	}

	@When("^i close browser$")
	public void i_close_browser() throws Throwable 
	{
		driver.close();
	    
	}
	@Then("^i should see error message$")
	public void i_should_see_error_message() throws Throwable {
	    
		String errmsg;
		errmsg=driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid"))
		{
			System.out.println("Login displayed apprpiate Error Message for Invalid inputs");
		}
		
	//Add Employee Regestration
		    
	}

		@ When("^i go to add employee page$")
		public void i_go_to_add_employee_page() throws Throwable 
		{
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
		    
		    
		}

		@When("^i enter firstname as \"([^\"]*)\"$")
		public void i_enter_firstname_as(String arg1) throws Throwable 
		{
			
		    driver.findElement(By.id("firstName")).sendKeys("Abhishek");
		}

		@When("^i enter second name as \"([^\"]*)\"$")
		public void i_enter_second_name_as(String arg1) throws Throwable 
		{
			driver.findElement(By.id("lastName")).sendKeys("Gaur");
		    
		}

		@When("^i click save$")
		public void i_click_save() throws Throwable 
		{
			driver.findElement(By.id("employeeId")).getAttribute("value");
			driver.findElement(By.id("btnSave")).click();
		    
		}

		@Then("^i should see new employee details table$")
		public void i_should_see_new_employee_details_table() throws Throwable 
		{
			driver.findElement(By.linkText("Employee List")).click();
			driver.findElement(By.id("empsearch_id")).sendKeys(empno);
			driver.findElement(By.id("searchBtn")).click();		
			
			WebElement restable = driver.findElement(By.id("resultTable"));
			List<WebElement> rows = restable.findElements(By.tagName("tr"));
			
			boolean isempdisplayed = false;
			for(int i=1;i<rows.size();i++)
			{
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
				if(cols.get(1).getText().equalsIgnoreCase(empno))
				{
					isempdisplayed = true;
					break;
				}
			}
			if(isempdisplayed)
			{
				System.out.println("New Employee Registered Successfully, test pass");
			}else
			{
				System.out.println("New Employee Registered not displayed in Employee Details table, test fail");
			}
		}


	}



 