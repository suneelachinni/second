package selenium001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class covidHospital {
	public static WebDriver driver;
	
	//public static void main(String[] args) throws InterruptedException 
	public static void collectDataFromWebsite() throws InterruptedException{
		
	
	
	System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");

//to know no.of hospitals
int noOfHospitals = driver.findElements(By.xpath("//div[@class='card custom-card']")).size();
System.out.println("total no of hospitals="+noOfHospitals);



for (int i=1;i<120;i++){

    //to print hospital name
WebElement hospName=driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//a"));
System.out.println(hospName.getText());

   //to print no.of beds
String noOfBeds=driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]/div/div/div/div/div[2]/div/div/div/div/span[@class='count-text']")).getText();
System.out.println(noOfBeds);

driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[@class='card-header']")).click();
Thread.sleep(500);

//WebElement o2beds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[text()='HDU(O2)']/../div[2]"));
//System.out.println("O2 beds : " + o2beds.getText() );

//WebElement ventBeds = driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]//div[text()='Ventilator']/../div[2]"));
//System.out.println("ventilator Beds : " + ventBeds.getText() );


//to print o2 bedes
String o2beds= driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]/div[2]/div/ul/li[2]/div/div[2]")).getText();
System.out.println("count of 02beds="+o2beds);

//to print ventilators
String ventilators=driver.findElement(By.xpath("//div[@class='card custom-card']["+i+"]/div[2]/div/ul/li[4]/div/div[2]")).getText();
System.out.println("no of ventilators="+ventilators);


hospName.click();
Thread.sleep(500);

//to print contact no
String contact=driver.findElement(By.xpath("//div[@id='hospital-details']/div/div/div/ul/li[2]/a/span[2]")).getText();
System.out.println("contact no="+contact);


//to print address
  String address=driver.findElement(By.xpath("//div[@id='hospital-details']/div/div/div/ul/li/div/label[@id='lblhosaddress']")).getText();
System.out.println("address=="+address);

driver.findElement(By.xpath("//button[@class='close']/span")).click();

Thread.sleep(500);






}

    //to know number of hospitals-find elements gives list of web elements with same path
     //int noOfHospitals=driver.findElements(By.xpath("//div[@class='card custom-card']//a")).size();
     //System.out.println("number of hospitals="+noOfHospitals);
     
     
//to know number of hospitals by using List
    // List<WebElement> listofhospitals= driver.findElements(By.xpath("//div[@class='card custom-card']"));
     //listofhospitals.size();
     //System.out.println("list of hospitals="+listofhospitals);
     //System.out.println("list of hospitals="+listofhospitals.size());

}



public static void zonewise() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
			
	WebElement zonesel = driver.findElement(By.id("ddlZone"));
	Select zonedropdown = new Select (zonesel);
	zonedropdown.selectByVisibleText("Central Zone");
	//collectDataFromWebsite();
	Thread.sleep(1000);
	
}


public static void main(String[] args) throws InterruptedException {
	
	zonewise();
	
	//collectDataFromWebsite();
}
}