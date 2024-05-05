import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.findElement(By.xpath("//div/div[@class='jumbotron-fluid']/li[2]/a")).click();
		driver.findElement(By.xpath("//div/ul/"));
	}

}
