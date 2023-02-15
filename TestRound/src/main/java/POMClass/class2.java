package POMClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2 {

	@FindBy
	(xpath= "//a[text()='Open New Seperate Windows']")
	private WebElement Window;
	
	@FindBy
	(xpath= "//button[text()='click']")
	private WebElement Windowhandle;
	
	@FindBy
	(xpath ="//a[@href='/downloads']")
    private WebElement handle;
	
	private WebDriver driver;
	
	public class2(WebDriver driver12) {
		PageFactory.initElements(driver12, this);
		this.driver = driver12;
	}
	
	public void ClickonButton() throws InterruptedException {
		Thread.sleep(2000);
		Window.click();
		
	}
	
	public void secondwindow() throws InterruptedException {
		Thread.sleep(3000);
		Windowhandle.click();
  	}
	
}
