package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;



public class Positive {

	WebDriver driver;
	
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\12Dec2020\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		//Clicking on Signin link
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		//Accessing Create Account 
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("ryan.rajendrans7@gmail1.com");
		
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
		
		//Entering Personal information	and registering
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		    WebElement firstname1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer_firstname")));
		    firstname1.click();
		    firstname1.clear();
		    firstname1.sendKeys("Ryan");
		
		    WebDriverWait wait1 = new WebDriverWait(driver, 10);
		    WebElement lastname1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer_lastname")));
		    lastname1.click();
		    lastname1.clear();
		    lastname1.sendKeys("Rajendran");
		
		
		    WebDriverWait wait2 = new WebDriverWait(driver, 10);
		    WebElement password1 = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwd")));
		    password1.click();
		    password1.clear();
		    password1.sendKeys("Check123");
		    
		    WebDriverWait wait3 = new WebDriverWait(driver, 10);
		    WebElement firstname2 = wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#firstname")));
		    firstname2.click();
		    firstname2.clear();
		    firstname2.sendKeys("Ryan");
		    
		    WebDriverWait wait4 = new WebDriverWait(driver, 10);
		    WebElement lastname2 = wait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#lastname")));
		    lastname2.click();
		    lastname2.clear();
		    lastname2.sendKeys("Rajendran");
		    
		    WebDriverWait wait5 = new WebDriverWait(driver, 10);
		    WebElement address1 = wait5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#address1")));
		    address1.click();
		    address1.clear();
		    address1.sendKeys("Lonsdale");
		    
		    WebDriverWait wait6 = new WebDriverWait(driver, 10);
		    WebElement city = wait6.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#city")));
		    city.click();
		    city.clear();
		    city.sendKeys("Altona");
		    
		    WebElement day=driver.findElement(By.id("id_state"));
		    Select d1 = new Select(day);
		    d1.selectByIndex(3);
		    
		    WebDriverWait wait7 = new WebDriverWait(driver, 10);
		    WebElement mobile1 = wait7.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#phone_mobile")));
		    mobile1.click();
		    mobile1.clear();
		    mobile1.sendKeys("491649545");
		    
		    WebDriverWait wait8 = new WebDriverWait(driver, 10);
		    WebElement zip = wait8.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#postcode")));
		    zip.click();
		    zip.clear();
		    zip.sendKeys("12345");

		   
		    
		   driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")).click();
		   
		  
		   //Validating access to account
		   
		   if((driver.getPageSource().contains("Welcome"))) 
			{
				System.out.println("You have successully registered!");
			}
		    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive obj= new Positive();
		obj.LaunchBrowser();
		
		
	}

}
