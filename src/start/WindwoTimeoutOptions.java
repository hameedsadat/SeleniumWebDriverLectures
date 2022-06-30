package start;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwoTimeoutOptions {

	public static void main(String[] args) throws IOException {
		
		
		
		/* lecture of the day (5-25-2022)
		 * 
		 * Interface WebDriver,  Options
		 * Interface WebDriver , Timeouts
		 * Interface WebDriver , Navigation
		 * Interface WebDriver , Window
		 */
		
		System.setProperty ("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		//implicitlyWait​(java.time.Duration duration);
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		 driver.getTitle();
			String title = driver.getTitle();
			String currentUrl = driver.getCurrentUrl();
					System.out.println(currentUrl);
					System.out.println(title);
					
					
					 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    // FileUtils.copyFile(f, new File("C:/Users/Chait/Desktop/Screenshots/screenshot01.png"));
				     FileUtils.copyFile(f, new File(" C:/Users/Snoopy/eclipse-workspace/SeleniumLecture/src/screenshots.png"));
				     //FileUtils.copyFile(f, new File(".src/screenshots.png"));
				      //screenshot copied from buffer is saved at the mentioned path.
				 
				     System.out.println("The Screenshot is captured.");  
		//Cookies
		driver.manage().deleteAllCookies();
		
		
		// Navigation: 
		
		driver.navigate(). to("https://www.w3schools.com/java/java_comments.asp");
	
		driver.navigate().back();
	
		driver.navigate().forward();
		driver.navigate().refresh();	
	
			
		driver.close();
	}

}
