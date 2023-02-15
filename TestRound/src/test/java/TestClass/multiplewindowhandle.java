package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClass.class2;

public class multiplewindowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar wagh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    
	    class2 ok = new class2(driver);
	    ok.ClickonButton();
	    
	    ok.secondwindow();
	    
	}
}
