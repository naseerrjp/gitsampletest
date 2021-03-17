package base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.*;
import commonUtils.TestUtil;


public class TestBase {

		public static Properties prop;
		public static WebDriver driver;
		public TestBase()
		{
			prop = new Properties();
			String path = System.getProperty("user.dir")+"//src//test//resources//config//config.properties";
			FileInputStream fin;
			try {
				fin = new FileInputStream(path);
				prop.load(fin);
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		public static void initialize() {
			String browser = prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");

		
		

	}}


