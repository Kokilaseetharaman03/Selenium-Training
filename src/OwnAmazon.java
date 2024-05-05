import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com");
driver.manage().window().maximize();
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.className("submit-button")).click();
driver.findElement(By.xpath("//a[@href='item_4_title_link']")).click();
//driver.close();
	}
}
