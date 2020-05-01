package phase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumMethods {
	
	static String driverPath = System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");
	protected static WebDriver driver = new ChromeDriver();
	
	public static void LaunchURL(String url){
		
		try{
			Thread.sleep(2000);
			driver.get(url);
			driver.manage().window().maximize();
			
			String LaunchedUrl = driver.getCurrentUrl();
			
			if(url.equals(LaunchedUrl)){
				System.out.println("URL launched successfully");
			}
			else{
				System.out.println("Error occured while launching URL...!!");
			}
		}
		catch(Exception e){
			System.out.println("Exception is :" + e);
		}
	}
	
	public static void MouseClick(String xPath){
		
		try{
			Thread.sleep(2000);
			WebElement WElement = driver.findElement(By.xpath(xPath));
			
			if(WElement.isDisplayed() && WElement.isEnabled()){
				WElement.click();
				System.out.println("Clicked on WElement");
			}
			else{
				System.out.println("Web element is not displayed");
			}
		}
		catch(Exception e){
			System.out.println("Exception is :" + e);
		}		
	}
	
	public static void KeysEnter_XPATH(String xPath, String textValue){
		
		try{
			Thread.sleep(2000);
			WebElement WElement = driver.findElement(By.xpath(xPath));

			if(WElement.isDisplayed() && WElement.isEnabled()){
				WElement.sendKeys(textValue);
				
				String text = WElement.getAttribute("value");
				
				if(text.equals(textValue)){
					System.out.println("Text entered successfully");
				}
				else{
					System.out.println("Error occured while entering text");
				}
			}
			else{
				System.out.println("Web element is not displayed & is not enabled");
			}
		}
		catch(Exception e){
			System.out.println("Exception is :" + e);
		}		
	}
	
	public static void JSKeysEnter_ID(String iD, String textValue){
		
		try{
			Thread.sleep(2000);
			WebElement WElement = driver.findElement(By.id(iD));
			
			if(WElement.isDisplayed() && WElement.isEnabled()){
				WElement.sendKeys(textValue);
				
				JavascriptExecutor e = (JavascriptExecutor) driver;
				String text = (String) e.executeScript("return document.getElementById('" + iD +"').value");
				
				if(text.equals(textValue)){
					System.out.println("Text entered successfully");
				}
				else{
					System.out.println("Error occured while entering text");
				}
			}
			else{
				System.out.println("Web element is not displayed & is not enabled");
			}			
		}
		catch(Exception e){
			System.out.println("Exception is :" + e);
		}		
	}
}