package com.hrms.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;



public class General extends Global {
  public void openapplication() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "I:\\installer\\SeleniumDrivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	 driver.navigate().to(url);
	 System.out.println("Application opened");
	 Reporter.log("Application opened");
	 Log.info("Application opened"); 
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 //String s=driver.getTitle();
	 // System.out.println(s);
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	 {
		 System.out.println("title matched");
	 }
	 else {
		 System.out.println("title not matched");
	 }

  }
  
  public void login() throws Exception {
	  driver.findElement(By.name(txt_loginname)).sendKeys(un);
	  driver.findElement(By.name(txt_password)).sendKeys(pw);
	  driver.findElement(By.name(btn_login)).click();
	  System.out.println("Login successful");
	 Thread.sleep(3000);
	  if(driver.getTitle().equals("OrangeHRM")) 
	  {
		  System.out.println("title matched");
	  }
	  else {
		  System.out.println("title not matched");
	  }
	  String s=driver.findElement(By.xpath(welcome_txt)).getText();
	  System.out.println(s);
	 Boolean b= driver.findElement(By.xpath(welcome_txt)).getText().matches("Welcome admin");
	 System.out.println(b);
	 System.out.println("login completed");
	 Reporter.log("login completd");
	 Log.info("Login completed");
  }
  
  public void MenuNavigate() throws InterruptedException {
	  WebElement element =driver.findElement(By.linkText(Menu));
	  Actions action = new Actions(driver);
	  action.moveToElement(element).build().perform();
	  Thread.sleep(2000); 
	  driver.findElement(By.linkText(link_AddEmp)).click();
	  System.out.println("Clicked on add emp");
	  Reporter.log("clicked on add emp");
	  Log.info("clicked on add emp");
	  Thread.sleep(2000);
  }
 
  public void AddEmp() throws InterruptedException {
	  driver.switchTo().frame("rightMenu");
	  driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).sendKeys(code);
	  Thread.sleep(2000);
	  driver.findElement(By.id(txt_Lname)).sendKeys(Lname);
	  driver.findElement(By.name(txt_Fname)).sendKeys(Fname);
	  driver.findElement(By.xpath(btn_save)).click();
	  Thread.sleep(3000);
	  System.out.println("employee added");
	  Reporter.log("employee added");
	  Log.info("employee added");
	  driver.switchTo().defaultContent();
  }

  public void MenuNavigate2() throws InterruptedException {
	 WebElement element =driver.findElement(By.linkText(Menu));
	  Actions action = new Actions(driver);
	  action.moveToElement(element).build().perform();
	  Thread.sleep(2000); 
	  driver.findElement(By.linkText(link_EmpList)).click();
	  System.out.println("Clicked on emp list");
	  Reporter.log("Clicked on emp list");
	  Log.info("Clicked on emp list");
	  Thread.sleep(2000);
	  
  }
  

  public void SearchEmp() throws InterruptedException {
	  driver.switchTo().frame("rightMenu");
	  Select st=new Select(driver.findElement(By.id(select_dd)));
	  st.selectByVisibleText("Emp. ID");
	  Thread.sleep(2000);
	  driver.findElement(By.id(Eid)).sendKeys(EmpId);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(search_Eid)).click();
	  System.out.println("employee searched");
	  Reporter.log("employee searched");
	  Log.info("employee searched");
	  Thread.sleep(3000);
	  
  }
  public void DeleteEmp() throws InterruptedException {
	  driver.findElement(By.name(Check_Box)).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(DelEmp)).click();
	  System.out.println("employee id deleted successfully");
	  Reporter.log("employee id deleted successfully");
	  Log.info("employee id deleted successfully");
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
  }
  public void closeapplication() throws InterruptedException {
	  driver.findElement(By.linkText(link_logout)).click();
	  System.out.println("Logout completed");
	  Reporter.log("Logout completed");
	  Log.info("Logout completed");
	  Thread.sleep(3000);
	  driver.close();
  }
  
}
