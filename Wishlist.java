package hANDmPROJECTY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wishlist {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www2.hm.com/en_in/index.html");
		Thread.sleep(2);
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		WebElement ladiesLink = driver.findElement(By.xpath("//div/../a[text()='Ladies']"));
		ladiesLink.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//dd/a[text()='Tops & T-shirts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-saved-text='SAVED AS FAVOURITE']")).click();
		//to check in favorites
		driver.findElement(By.xpath("//span[text()='Favourites']")).click();
		driver.navigate().back();
		driver.quit();
	}
	}
