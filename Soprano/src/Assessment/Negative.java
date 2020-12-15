package Assessment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative {

	
WebDriver driver;
	
public void Validatecreate() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\12Dec2020\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
		
	
	        //Clicking on Signin link
			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Clicking on Create Accoung without populating Email address			
			driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
		
			String actualerrormessage= driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
			String expectederrormessage = "Invalid email address.";
			Assert.assertEquals(expectederrormessage,  actualerrormessage);
			System.out.println ("Error message is shown and validated succesfully");
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Negative obj= new Negative();
		obj.Validatecreate();
	}

}
