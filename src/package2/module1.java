package Testsuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class module1 {
	
	
	@BeforeSuite
	public void suiteStart() {
		System.out.println("I am executing before suite");
	}
	
	@BeforeClass
	public void classstart() {
		System.out.println("I am executing before class");
	}
	
	@AfterSuite
	public void suiteend() {
		System.out.println("I am executing after suite");
	}
	
	@BeforeTest
	public void teststart() {
		System.out.println("I am executing befote test start");
	}
	
	@AfterTest
	public void testend() {
		System.out.println("I am executing end of test");
	}
	

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
	}
	
	@Test
	public void test001() {
		System.out.println("I am executing test001");
	}
	@Test
	public void test002() {
		System.out.println("I am executing test002");
	}
	@Test
	public void test003() {
		System.out.println("I am executing test003");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}
		
@DataProvider
public Object [][]datainput(){
	Object[][] data= {{"suneela","chinni"},{"Suneela","Akuluru"}};
	return data;
}

@Test(dataProvider ="datainput" )
public void login (String username,String password) {
	System.out.println(username +"and"+password);
	
}

@AfterClass
	public void classend() {
		System.out.println("I am executing after class");
	}

}


