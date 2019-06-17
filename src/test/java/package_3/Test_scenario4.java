package package_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test_scenario4 {
	WebDriver driver;
	@Given("Login as Admin")
	public void login_as_Admin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Password456");   
		driver.findElement(By.name("Login")).click();
	}

	@Given("click add new product")
	public void click_add_new_product() {
		driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();  
	}

	@Then("select category")
	public void select_category() {
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 
	}

	@Then("select sub-category")
	public void select_sub_category() {
		Actions a1=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		a1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();     
	}

@Then("Enter product name {string}")
public void enter_product_name(String string) {
	driver.findElement(By.name("prodname")).sendKeys(string); 
}

@Then("Enter price {string}")
public void enter_price(String string) {
	driver.findElement(By.name("pricename")).sendKeys(string); 
}

@Then("Enter Quantity {string}")
public void enter_Quantity(String string) {
	driver.findElement(By.name("Quantity")).sendKeys(string);
}



	@Then("Enter brand")
	public void enter_brand() {
		driver.findElement(By.name("Brand")).sendKeys("Lenovo");
		
	}

	@Then("give description")
	public void give_description() {
		driver.findElement(By.name("description")).sendKeys("abcd");    
	}

	@Then("click submit")
	public void click_submit() {
		driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(13) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();   
        driver.close();
	}

}
