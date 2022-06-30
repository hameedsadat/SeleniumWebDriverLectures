package start;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		/* lecture of the day (5-25-2022)
		 * Launch Firefox browser
		 */
		
		String driverpath = ".\\drivers\\geckodriver.exe";
		
		System.setProperty ("webdriver.gecko.driver",driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.getCurrentUrl();
		driver.getTitle();
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		
	
		System.out.println(currentUrl);
		System.out.println(title);
		driver.close();

	}

}
