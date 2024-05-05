import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver driver =new ChromeDriver();

//System.setProperty("webdriver.chrome.driver","C:\\Users\\madhi\\Desktop\\Madhi\\Annaisarada\\springboot-swagger-test\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

//launching the specified URL
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		String title = driver.getTitle();
		System.out.println("The title is " +title);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
        driver.close();
		//WebElement jobsearch = driver.findElement(By.id("search-input--par"));
		//jobsearch.sendKeys("quality"); 

		//WebElement search = driver.findElement(By.className("search-btn"));

		//search.click();

	}
}
