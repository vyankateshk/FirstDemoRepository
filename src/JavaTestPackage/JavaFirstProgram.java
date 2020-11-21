package JavaTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Eclipse/Google Chrome Drivers_86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Java - First Program in Java");
		
		driver.get("https://www.google.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
		text.clear();
		text.sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]")).click();
		
		
		text.click();
		
		
		
		
		
		
	}
	
}

		