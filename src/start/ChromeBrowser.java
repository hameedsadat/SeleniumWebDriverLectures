package start;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws Exception {

		/*
		 * lecture of the day (5-25-2022) Launch Chrome browser
		 */

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		ScreenShotUtility.takeScreenShot(driver);
		driver.getCurrentUrl();
		driver.getTitle();
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
		System.out.println(title);
		 /*Date currentDate = new Date();
		String screenshotFileName = currentDate.toString().replace(" ", " -").replace(":", "-");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".//screenpics//" + screenshotFileName + ".png"));
		
		System.out.println("second shot"); */

		driver.navigate().to("https://www.w3schools.com/java/java_comments.asp");
		ScreenShotUtility.takeScreenShot(driver);
		driver.close();
	}

}
