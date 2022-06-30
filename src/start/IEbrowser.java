package start;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) {
		/* lecture of the day (5-25-2022)
		 * Launch IE browser
		 */
	
		System.setProperty ("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
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
