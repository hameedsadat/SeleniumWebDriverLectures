package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser {

	public static void main(String[] args) {
		
		/* lecture of the day (5-25-2022)
		 * Launch edge browser
		 */
		
		System.setProperty ("webdriver.edge.driver",".\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
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
