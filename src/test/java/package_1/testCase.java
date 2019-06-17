package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testCase {
	WebDriver driver;
	@Given("Enter username and password")
	public void enter_username_and_password() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Password456");
		
		
		
	}
	@Given("click login")
	public void click_login() {
		driver.findElement(By.name("Login")).click();
	}

	@Given("click add product")
	public void click_add_product() {
		driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();
	    
	}

	@Given("Enter the details of the product")
	public void enter_the_details_of_the_product() {
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.name("prodname")).sendKeys("hp laptop"); 
		driver.findElement(By.name("pricename")).sendKeys("120");
		driver.findElement(By.name("Quantity")).sendKeys("2");
		driver.findElement(By.name("Brand")).sendKeys("HP");
		driver.findElement(By.name("description")).sendKeys("abcd");
	    
	}

	@When("click Add product")
	public void click_Add_product() {
		driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(13) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();   
  
	}

	@When("click signout")
	public void click_signout() {
		driver.findElement(By.linkText("SignOut")).click();  
	}

	@Given("Login")
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")));
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click(); 
	}

	@When("search for a product and add to cart")
	public void search_for_a_product_and_add_to_cart() {
		WebDriverWait Wait=new WebDriverWait(driver,10);
		  
		  WebElement search=driver.findElement(By.name("products"));
		  
		  Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"myInput\"]")));
		  search.sendKeys("Headphone");
		  driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
		  driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click(); 
	}

	@Then("Payment process")
	public void payment_process() {
		driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
		  driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
		  driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
		  WebDriverWait wait = new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
		  driver.findElement(By.cssSelector("#swit > div:nth-child(10) > div > label > i")).click();
		  
		  driver.findElement(By.id("btn")).click();
		  driver.findElement(By.name("username")).sendKeys("thejeshkal30");
		  driver.findElement(By.name("password")).sendKeys("divyadaksh");
		  driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > div > div:nth-child(3) > input[type=submit]")).click();
		  driver.close(); 
	}
	
}
