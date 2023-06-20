package Assignment9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(opt);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
	   
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement signUpBtn=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		Thread.sleep(1000);
        je.executeScript("arguments[0].scrollIntoView(true);", signUpBtn );
		
		if(!signUpBtn.isEnabled())
		{
			  System.out.println("Sign-up button is disabled.");
		} else {
		    System.out.println("Sign-up button is enabled.");
		}
		 
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		   je1.executeScript("window.scrollTo(0, 0);");
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Amruta");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ineuron@ineuron.ai");
		 
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("ineuron");
		 
		WebElement interestCB=driver.findElement(By.xpath("//label[text()='Testing']"));
		interestCB.click();
		 
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement signUpBtn1=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		Thread.sleep(1000);
        je.executeScript("arguments[0].scrollIntoView(true);", signUpBtn1 );
		
        Thread.sleep(2000);
       driver.findElement(By.xpath("//label[text()='Male']")).click();
         
       Select se=new Select(driver.findElement(By.xpath("//select[@id='state']")));
       se.selectByValue("Assam");
       
       boolean issignIn = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).isDisplayed();
       assert issignIn : "User login unsuccessful, user not created";

       WebElement signUpBt=driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
       signUpBt.click();
      
       // Rest of the code
       // ...
       WebElement element = driver.findElement(By.xpath("//nav[@class='navbar-menu-parent']//button[1]"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

       // Click on the element
       element.click();
      
//      WebElement login=driver.findElement(By.xpath("//nav[@class='navbar-menu-parent']//button[1]"));
//      login.click();
       WebElement emailLogin=driver.findElement(By.id("email1"));
       emailLogin.sendKeys("ineuron@ineuron.ai");
       WebElement pwdLogin=driver.findElement(By.id("password1"));
       pwdLogin.sendKeys("ineuron");
	
	
	}

}
