package com.utilita.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
		 public TestBase(){
		
			 try{
				 prop=new Properties();
				 FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\config.properties");
				 prop.load(ip);
			 }catch(FileNotFoundException e){
				 e.printStackTrace();}
			 catch(IOException e){
				 e.printStackTrace();
			 }
			 }
		
		public void initialisation() throws InterruptedException{
			
			String browsername= prop.getProperty("browser");
			/*String browserFF;
			
			switch(browsername){
		
			case 1:
				if(browsername.equalsIgnoreCase("chrome")){
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					}
				
			}
			if(browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("FF")){
				driver=new FirefoxDriver();}
				else if(browsername.equals("IE")){
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriver\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}*/
			
			
			



			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.get(prop.getProperty("url"));
			System.out.println("app URL is:" + prop.getProperty("url"));
			
		}
		
	
}
