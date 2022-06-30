package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsImplementation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("http://tek-school.com/retail/");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.getTitle();
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(title);

		driver.manage().deleteAllCookies();
		//copy the xpath
		//WebElement MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		//MyAccount.click();
		//copy the xpath
		//WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		//login.click();
		
		 //created xpath
		//WebElement MyAccount =driver.findElement(By.xpath("//span[text()='My Account']"));
		//MyAccount.click();	
		
		//created xpaht
		//WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		//login.click();
		
		//copy the cssSelector
		//WebElement MyAccount=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		//MyAccount.click();
		
		//copy the cssSelector
		//WebElement login =driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
		//login.click();
		
		WebElement forgotpassword =driver.findElement(By.linkText(""));
	}

}
