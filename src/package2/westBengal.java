package selenium001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class westBengal {
	
	public static void collectHospData() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://westbengal.covidsafe.in/");
		
		int noOfHospitals = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr")).size();
		System.out.println("total no of hospitals="+noOfHospitals);
		
		for (int i=1;i<=20;i++) {
		
		
		WebElement hospname= driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+i+"][1]/td/div/button/strong"));
		System.out.println("hospital name = "+hospname.getText());
		
	
		
		String withoutOxyzen = driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+i+"][1]/td[2]/span[2]")).getText();
		System.out.println("Rooms with out oxyzen = "+withoutOxyzen);
		
		
		String withOxyzen = driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+i+"][1]/td[3]/span[2]")).getText();
		System.out.println("Rooms with oxyzen = "+withOxyzen);
		
		
		String icuNoVentillators = driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+i+"][1]/td[4]/span[2]")).getText();
		System.out.println("ICU with out ventillators = "+icuNoVentillators);
		
		String icuVentillators = driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+i+"][1]/td[5]/span[2]")).getText();
		System.out.println("ICU with ventillators = "+icuVentillators);
	
		
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]/div/button")).click();
		
		Thread.sleep(500);
		
		
		String phone=driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td/p[2]/span")).getText();
		System.out.println("phone no ="+phone);
		
		String pincode=driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td/p[3]/span")).getText();
		System.out.println("phone no ="+pincode);
		
		String address=driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td/p[4]/span")).getText();
		System.out.println("phone no ="+address);
		
		
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[1]/div/button")).click();
		Thread.sleep(500);
		}
		
		
	}
	
public static void main(String[] args) throws InterruptedException {
		
	collectHospData();

}
}
