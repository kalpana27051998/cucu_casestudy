package package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class test_scenario3 {
	WebDriver driver;
	@Given("login as admin")
	public void login_as_admin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Password456");    
		driver.findElement(By.name("Login")).click();
	}

	@Given("click Add to new product")
	public void click_Add_to_new_product() {
		driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();   
	}

	@Given("select category as {string}")
	public void select_category_as(String string) {
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		a.sendKeys(string).sendKeys(Keys.ENTER).build().perform();
		
	}

	@Given("select sub-category as {string}")
	public void select_sub_category_as(String string) {
		Actions a1=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		a1.sendKeys(Keys.ARROW_DOWN).sendKeys(string).sendKeys(Keys.ENTER).build().perform();  
	}

	@Given("Enter product name as {string}")
	public void enter_product_name_as(String string) {
		driver.findElement(By.name("prodname")).sendKeys(string);  
	}

	@Given("Enter price as {string}")
	public void enter_price_as(String string) {
		driver.findElement(By.name("pricename")).sendKeys(string);    
	}

	@Given("Enter Quantity as {string}")
	public void enter_Quantity_as(String string) {
		driver.findElement(By.name("Quantity")).sendKeys(string);    
	}

	@Given("Enter brand as {string}")
	public void enter_brand_as(String string) {
		driver.findElement(By.name("Brand")).sendKeys(string);   
	}

	@Given("give description as {string}")
	public void give_description_as(String string) {
		driver.findElement(By.name("description")).sendKeys(string);    
	}

	@Then("submit")
	public void submit() {
		driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(13) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();   
		driver.close(); 
	}

}
