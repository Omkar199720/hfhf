package TestClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClass.class2;

public class findthelinks {	
	
	private  WebDriver driver;
	private  class2 cls;
	
        @BeforeClass
        public void AutomatetheTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar wagh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        }
        
        @BeforeMethod
        public void launchtheBrowser() {
	    driver.get("http://demo.automationtesting.in/Windows.html");
        }
        
        @Test
        public void verifytheTab() throws InterruptedException {
        cls= new class2(driver);	
        cls.ClickonButton();
        cls.secondwindow();
        }
        
        @AfterMethod
        public void logoutfromthePage() {
        	System.out.println("logOut");
        	driver.close();
        }
        
        @AfterClass
        public void CleartheObjects() {
        	System.out.println("object is null");
        	driver = null;
        }
        
//	    List<WebElement> om=driver.findElements(By.tagName("a"));
//	    
//	    int a = om.size();
//	    System.out.println(a);
//	           
//	    
//	    Thread.sleep(1000);
//	    
//	    WebElement switch2 = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
//	    
//	    WebElement alertt = driver.findElement(By.xpath("//a[text()='Alerts']"));
//	
//	    Actions act = new Actions(driver);
//	    act.moveToElement(switch2).moveToElement(alertt).click().build().perform();	  
//	    
//	    System.out.println("alert success");
//	    
//	    
	}


