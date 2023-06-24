package hANDmPROJECTY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MenDetails {
	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www2.hm.com/en_in/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();
		Actions actions = new Actions(driver);
		WebElement MenLink = driver.findElement(By.xpath("//a[@href='/en_in/men.html']"));
		actions.moveToElement(MenLink).pause(Duration.ofSeconds(2)).perform();
	}
}		
