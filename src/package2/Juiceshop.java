package selenium001;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Juiceshop {

	
	public static void first() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://juice-shop.herokuapp.com/");
	//driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]/span[1]/span")).click();
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content")).click();
	driver.findElement(By.id("navbarAccount")).click();
	driver.findElement(By.xpath("//*[@id='navbarLoginButton']/span")).click();
	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
	//enter email id from console
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter User name:");
	//String s1=sc.nextLine();
	//Thread.sleep(1000);
	//email.sendKeys(s1,Keys.ENTER);
	
	email.sendKeys("s2022.chinni@gmail.com",Keys.ENTER);
	Thread.sleep(1000);
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	Thread.sleep(1000);
	password.sendKeys("chinni");
	Thread.sleep(2000);
	//click login button
	driver.findElement(By.xpath("//button[@id='loginButton']")).click();
	Thread.sleep(2000);
	
	//add product to basket
	driver.findElement(By.xpath("(//span[text()='Add to Basket'])[1]")).click();
	Thread.sleep(1000);
	//add product to basket
	driver.findElement(By.xpath("(//span[text()='Add to Basket'])[3]")).click();
	Thread.sleep(3000);
	//create webelement ....inspect xpath for required element and scroll to that product
	WebElement e1=driver.findElement(By.xpath("(//span[text()='Add to Basket'])[5]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", e1);
	
	  //print the dropdown
	//js.executeScript("window.scrollBy(250,500)");
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//js.executeScript("window.scrollBy(0,1500)");
	String s=driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c130-14']/div/span/span")).getText();
	Thread.sleep(1000);
	System.out.println(s);
	//capture the window pop up
	Thread.sleep(1000);
	driver.findElement(By.linkText("Me want it!")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c130-14']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//mat-option[@role='option'][3]/span")).click();
	Thread.sleep(1000);
	s=driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c130-14']/div/span/span")).getText();
	System.out.println(s);
	Thread.sleep(1000);
	
	//display which we selected from dropdown
	e1=driver.findElement(By.xpath("//div[@class='mat-paginator-page-size-label']"));
	js.executeScript("arguments[0].scrollIntoView();", e1);
	Thread.sleep(1000);
	
	//add product in 3rd page
	driver.findElement(By.xpath("(//span[text()='Add to Basket'])[35]")).click();
	
	//click the basket
	driver.findElement(By.xpath("//button[@tabindex='0']/span[@class='mat-button-wrapper']/mat-icon[@role='img']")).click();
	
	//increase the no.of items
	Thread.sleep(500);
	driver.findElement(By.xpath("//mat-cell[text()=' Apple Juice (1000ml) ']/../mat-cell[3]/button[2]/span")).click();
	driver.findElement(By.xpath("//mat-cell[text()=' Banana Juice (1000ml) ']/../mat-cell[3]/button[2]")).click();	
    
	//Thread.sleep(500);
	WebElement e2=driver.findElement(By.xpath("//button[@id='checkoutButton']/span"));
	js.executeScript("arguments[0].scrollIntoView();", e2);
	Thread.sleep(10000);
	e2.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
	
	//enter address
	Thread.sleep(2000);
   
	//enter country
	driver.findElement(By.id("mat-input-3")).sendKeys("USA",Keys.ENTER);
	Thread.sleep(500);
	
	//enter name
	driver.findElement(By.xpath("//input[@placeholder='Please provide a name.']")).sendKeys("SUNEELA5");
		Thread.sleep(200);
		
	//enter mobile number
	driver.findElement(By.xpath("//input[@placeholder='Please provide a mobile number.']")).sendKeys("1234567890");
	Thread.sleep(200);
	
	//enter zip code
	driver.findElement(By.xpath("//input[@placeholder='Please provide a ZIP code.']")).sendKeys("12345678");
	Thread.sleep(300);
	
	//enter address
	driver.findElement(By.xpath("//textarea[@placeholder='Please provide an address.']")).sendKeys("community");
	Thread.sleep(200);
	
	//enter city
	driver.findElement(By.xpath("//input[@placeholder='Please provide a city.']")).sendKeys("Dallas");
	Thread.sleep(200);
	
	//enter state
	driver.findElement(By.xpath("//input[@placeholder='Please provide a state.']")).sendKeys("TX");
	Thread.sleep(200);
	
	//click submit
	driver.findElement(By.xpath("//*[@id=\"submitButton\"]/span")).click();
	Thread.sleep(3000);
	
	//select address
	driver.findElement(By.xpath("//mat-cell[contains(text(),'SUNEELA5')]/../mat-cell/mat-radio-button")).click();
	driver.findElement(By.xpath("//*[@id=\"card\"]/app-address/mat-card/button/span[1]/span")).click();
	
	//select delevery speed
	Thread.sleep(300);
	driver.findElement(By.xpath("//mat-cell[contains(text(),'5 Days')]/../mat-cell/mat-radio-button")).click();
	driver.findElement(By.xpath("//span/mat-icon[contains(text(),'navigate_next')]")).click();
	
	//add card details
	Thread.sleep(500);
	driver.findElement(By.xpath("//span/mat-panel-description[contains(text(),'Add a credit or debit card')]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys("SURESH");
	WebElement cardNo=driver.findElement(By.xpath("//input[@id='mat-input-11']"));
	//cardNo.sendKeys("12345678");
	Thread.sleep(500);
	//WebElement carderror=driver.findElement(By.xpath("//div/mat-error[@id='mat-error-19']"));
	//Thread.sleep(300);
	//System.out.println("Invalid card number="+carderror.getText());
	//cardNo.clear();
	Thread.sleep(300);
	cardNo.sendKeys("1234567812345679");
	Thread.sleep(300);
	WebElement Exmonth = driver.findElement(By.xpath("//select[@id='mat-input-12']"));
	Exmonth.click();
	Thread.sleep(200);
	Select month = new Select(Exmonth);
	month.selectByVisibleText("5");
	Thread.sleep(200);
	WebElement ExYear = driver.findElement(By.xpath("//select[@id='mat-input-13']"));
	ExYear.click();
	Select year = new Select(ExYear);
	year.selectByVisibleText("2081");
	driver.findElement(By.xpath("//button[@id='submitButton']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//mat-cell[contains(text(),'5679')]/../mat-cell/mat-radio-button")).click();
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	driver.findElement(By.xpath("//span[text()='Place your order and pay']")).click();
	Thread.sleep(500);
	
//go to order history and check the order status	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement account = driver.findElement(By.xpath("//button/span/span[text()=' Account ']"));
	js.executeScript("arguments[0].scrollIntoView();",account);
	Thread.sleep(300);
	account.click();
	
	WebElement orderAndPayment= driver.findElement(By.xpath("//button/span[text()=' Orders & Payment ']"));
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView();",orderAndPayment);
	orderAndPayment.click();
	driver.findElement(By.xpath("//button/span[text()=' Order History ']")).click();
	js.executeScript("window.scrollBy(0,100)");
	driver.findElement(By.xpath("//button[@aria-label='Track Your Order']")).click();
	
	//driver.findElement(By.xpath("//button[@aria-label='Print order confirmation']")).click();
    
 }
	
	
public static void main(String[] args) throws InterruptedException {
	
	first();
}
	
}
