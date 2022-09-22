package selenium001;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class screenshot1 {
public static void captureScreenshot(String stepname) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
	WebDriver chromedriver=new ChromeDriver ();
	chromedriver.get("https://selenium.dev");
	

	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	
	TakesScreenshot screenshot= (TakesScreenshot)chromedriver;
	
	chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	
	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
	String TCName= "TC_001";
	String dir= System.getProperty("user.dir");
//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
String path =dir+"/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepname+".jpeg";
	
	File destFile = new File (path);
	FileUtils.copyFile(srcfile, destFile);	
}
public static void main(String[] args) throws IOException {
	try {
		captureScreenshot("selenium");
	}
	catch(Exception e){
		System.out.println("IO Exception:"+e.getMessage());
		
	}
}
}
