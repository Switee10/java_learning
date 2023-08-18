package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAss {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		WebElement wb=driver.findElement(By.xpath("//input[@type='search']"));
		wb.sendKeys("ber");
		
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();


	}

}
