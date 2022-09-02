package selenium001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class cosmocode {
	
	public static void main(String[] args) {
		//String path = System.getProperty("user.dir");
		//System.setProperty("Webdriver.Chrome.driver",path+"/src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		driver.findElement(By.id("firstname")).sendKeys("suneela");
		driver.findElement(By.className("lastname")).sendKeys("chinni");
		//driver.findElement(By.linkText("Click here to reload this page")).click();
		//driver.findElement(By.xpath(null))
		driver.findElement(By.name("language_java")).click();
		driver.findElement(By.name("language_python")).click();
		driver.findElement(By.name("language_c#")).click();
		driver.findElement(By.name("language_c")).click();
		driver.findElement(By.name("language_vbs")).click();
		//driver.findElement(By.name(""))
		//driver.findElement(By.partialLinkText("submit_htmlform")).submit();
		//driver.findElement(By.xpath("//inputf[@type='submit' and @value='Submit']")).click();
	
		//driver.findElement(By.linkText("random-text-xyz-i-wont-change-random-digit-123")).click();
		//driver.findElement(By.linkText("Click Me to open New Window")).click();
		driver.findElement(By.tagName("Under 20")).click();
		
		
		
	}

}
