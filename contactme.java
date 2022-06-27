package priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class contactme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/itctesting02/Downloads/portfoliofinal-main/Login%20Form/index.html");
        driver.findElement(By.id("first name")).sendKeys("Priyanga");
        driver.findElement(By.id("Email")).sendKeys("priyarp0001@gmail.com");
        driver.findElement(By.id("subject")).sendKeys("send your CV");
        driver.findElement(By.id("message")).sendKeys("Iam much interested with your portfolio.May I know what is the plesure time to talk with you?");
        driver.findElement(By.id("send-message")).click();
        
	}

}
