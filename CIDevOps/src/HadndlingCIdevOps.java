import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadndlingCIdevOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Test
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meenatchi\\Desktop\\Java class Videos\\chromedriver_win32_85\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");

			System.out.println(driver.getTitle());
			
			WebElement username = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
			username.sendKeys("Tester");

			WebElement password = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
			password.sendKeys("test");
			
			WebElement login = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
			login.click();


	}

}
