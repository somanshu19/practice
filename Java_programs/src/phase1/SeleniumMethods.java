package phase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
	
	public static void LaunchURL(String url){
		
		System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try{
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
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
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LaunchURL("https://www.amazon.in/");
	}
}