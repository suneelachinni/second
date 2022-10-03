package selenium001;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tutorialsninzaJava {
	
	
	WebDriver driver;
	
	
	@Test (priority = 1)
	
	public void primarySetting() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users/SHOME/eclipse-workspace/Test1-Maven/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
		WebElement currency =driver.findElement(By.xpath("//button[@name='EUR']"));
		System.out.println("selected currency ="+currency.getText());
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(currency.getText(), "€ Euro");
		Thread.sleep(200);
		currency.click();
	}
    
    
    @Test(priority=2)
    public void orderCamera() {
    	
    	driver.findElement(By.xpath("//a[text()='Canon EOS 5D']")).click();
    	WebElement select = driver.findElement(By.xpath("//select[@id='input-option226']"));
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();",select);
    	select.click();
    	System.out.println(select.getText());
    	Assert.assertEquals(select.getText(),"  ");
    }
    
    @Test(priority=3)
    public void orderiphone() {
    WebElement home=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",home);
	home.click();
	driver.findElement(By.xpath("//a[text()='iPhone']")).click();
	WebElement qty=driver.findElement(By.xpath("//input[@id='input-quantity']"));
	js.executeScript("arguments[0].scrollIntoView();",qty);
	qty.clear();
	qty.sendKeys("2");
	driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	System.out.println("Iphone added in to cart seccessefully");
    
    }
	
	@Test(priority=4)
	public void updateCart() throws InterruptedException {
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong[text()=' View Cart']")).click();
		Thread.sleep(1000);
		WebElement qty1=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
		qty1.clear();
		qty1.sendKeys("3");
		driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		Thread.sleep(1000);
		System.out.println("Updated Iphone Qty="+qty1.getAttribute("value"));
		Assert.assertEquals("3",qty1.getAttribute("value"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement ecoTax=driver.findElement(By.xpath("//div[@class='row']/div/table/tbody/tr[2]/td[2]"));
		System.out.println("Eco Tax (-2.00):"+ecoTax.getText());
		WebElement VAT=driver.findElement(By.xpath("//div[@class='row']/div/table/tbody/tr[3]/td[2]"));
		System.out.println("VAT (20%):"+ecoTax.getText());
		driver.findElement(By.xpath("//div[@class='col-sm-12']/div[3]/div[2]/a")).click();
		WebElement error= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		System.out.println(error.getText());
		driver.findElement(By.xpath("//button[@class='btn btn-danger']/i")).click();
		Thread.sleep(500);
	}
	@Test(priority = 5)
	public void orderMacbook() throws InterruptedException {
		WebElement home1=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",home1);
		Thread.sleep(300);
		home1.click();
		driver.findElement(By.xpath("//h4/a[text()='MacBook']")).click();
		WebElement qty3=driver.findElement(By.xpath("//input[@id='input-quantity']"));
		Thread.sleep(200);
		String a=qty3.getAttribute("value");
		System.out.println(" Macbook default quantity="+a);
		Assert.assertEquals("1",a);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		WebElement successMsg=driver.findElement(By.xpath("//*[@id='product-product']/div[1]"));
		//System.out.println("print success message="+successMsg.getText());
		//Assert.assertEquals("Success: You have added MacBook to your shopping cart!",successMsg.getText());
		
	}
	
	@Test(priority=6)
	public void applyCouponcode() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		Thread.sleep(500);
		WebElement couponcode=driver.findElement(By.xpath("//h4/a[text()='Use Coupon Code ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		couponcode.click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("ABCD123");
		driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
		Thread.sleep(500);
		WebElement errormsg1=driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]"));
		System.out.println("error message for coupon code="+errormsg1.getText());
		System.out.println(errormsg1.getText()+"#####################");
		System.out.println(errormsg1.getText().contains("Coupon is ither invalid"));
		Assert.assertTrue(errormsg1.getText().contains("Coupon is ither invalid"));
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-voucher']")).sendKeys("AXDFGH123");
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='button-voucher']")).click();
		Thread.sleep(1000);
		WebElement errormsg2= driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]"));
		System.out.println("errormasg for giftcode="+errormsg2.getText());
		Thread.sleep(1000);
		//Assert.assertEquals("Warning: Gift Certificate is either invalid or the balance has been used up!",errormsg2.getText());
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//WebElement couponcode=driver.findElement(By.xpath("//h4/a[text()='Use Coupon Code ']"));
		couponcode.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='input-coupon']")).clear();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-voucher']")).clear();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		
	}
	
	
	@Test(priority=8)
	public void checkout() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='button-account']")).click();
		js.executeScript("window.scrollBy(0,100)","");
		Thread.sleep(500);
		driver.findElement(By.id("input-payment-firstname")).sendKeys("SUNEELA");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("CHINNI");
		driver.findElement(By.id("input-payment-email")).sendKeys("schinni@gmail.com");
		driver.findElement(By.id("input-payment-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("COMMUNITY#103");
		driver.findElement(By.id("input-payment-city")).sendKeys("DALLAS");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("524101");
		driver.findElement(By.id("input-payment-password")).sendKeys("chinni");
		driver.findElement(By.id("input-payment-confirm")).sendKeys("chinni");
		
		WebElement country = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.id("input-payment-country")));
				Select SelectCountry =  new Select(country);
				//SelectCountry.selectByValue(country);
				SelectCountry.selectByIndex(223);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)","");
		WebElement city = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.id("input-payment-zone")));
		Select selectcity = new Select (city);
		selectcity.selectByIndex(5);
		
		driver.findElement(By.id("newsletter")).click();
		Thread.sleep(200);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(200);
		driver.findElement(By.id("button-register")).click();
		Thread.sleep(1000);
		WebElement writecomment = new WebDriverWait(driver,Duration.ofSeconds(60)).
				until(ExpectedConditions.elementToBeClickable(By.name("comment")));
		
		writecomment.sendKeys("order placed");
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.id("button-payment-method")).click();
		WebElement paymenterror = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Warning: Payment method required!']")));
		String paymenterror1 = paymenterror.getText();
		System.out.println("Payment Error Msg :"+paymenterror1);
		String paymentreqmsg = "Warning: Payment method required!";
		Assert.assertEquals(paymenterror.getText(),"Warning: Payment method required!");
	}
	
	
	@Test (priority = 8)
	public void complaint()
	{
		driver.findElement(By.xpath("//footer//a[text()='Contact Us']")).click();
		
		WebElement yourname = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.id("input-name")));
		yourname.sendKeys("sun");
		
		WebElement youremail = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.id("input-email")));
		youremail.sendKeys("sun1@gmail.com");
		
		WebElement enquiryTextArea = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.id("input-enquiry")));
		enquiryTextArea.sendKeys("Not able to add bank details ");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		WebElement continueButton = new WebDriverWait(driver,Duration.ofSeconds(30)).
				until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue']")));
		continueButton.click();	
	}
	
	

	
}
