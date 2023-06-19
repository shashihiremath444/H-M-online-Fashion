package hANDmPROJECTY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickOnLogo {
	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www2.hm.com/en_in/women/seasonal-trending/inl-vacation-edit.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept all cookies']")).click();	
		driver.findElement(By.className("Header-module--logo__uvR9z")).click();
		
	}
}
