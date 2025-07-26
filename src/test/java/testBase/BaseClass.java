////package testBase;
////
////import java.io.File;
////import java.io.FileReader;
////import java.io.IOException;
////import java.net.URL;
////import java.text.SimpleDateFormat;
////import java.time.Duration;
////import java.util.Date;
////import java.util.Properties;
////
////import org.apache.commons.lang3.RandomStringUtils;
////import org.apache.logging.log4j.LogManager;
////import org.apache.logging.log4j.Logger;
////import org.openqa.selenium.OutputType;
////import org.openqa.selenium.Platform;
////import org.openqa.selenium.TakesScreenshot;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.chrome.ChromeOptions;
////import org.openqa.selenium.edge.EdgeDriver;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.remote.DesiredCapabilities;
////import org.openqa.selenium.remote.RemoteWebDriver;
////import org.testng.annotations.AfterClass;
////import org.testng.annotations.BeforeClass;
////import org.testng.annotations.Parameters;
////
////public class BaseClass {
////	
////public static WebDriver driver;
////public Logger logger;
////public Properties p;
////	
////
////
////@BeforeClass(groups= {"Sanity","Regression","Master"})
////@Parameters({"os","browser"})
////public void setup(String os, String br) throws IOException
////{
////		//Loading config.properties file
////	FileReader file=new FileReader("./src//test//resources//config.properties");
////	p=new Properties();
////	p.load(file);
////			
////	logger=LogManager.getLogger(this.getClass());  //lOG4J2
////			
////	if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
////	{
////		DesiredCapabilities capabilities=new DesiredCapabilities();
////		
////		//os
////		if(os.equalsIgnoreCase("windows"))
////		{
////			capabilities.setPlatform(Platform.WIN11);
////		}
////		else if(os.equalsIgnoreCase("linux"))
////		{
////			capabilities.setPlatform(Platform.LINUX);
////			
////		}
////		else if (os.equalsIgnoreCase("mac"))
////		{
////			capabilities.setPlatform(Platform.MAC);
////		}
////		else
////		{
////			System.out.println("No matching os");
////			return;
////		}
////		
////		//browser
////		switch(br.toLowerCase())
////		{
////		case "chrome": capabilities.setBrowserName("chrome"); 
////		
////		break;
////		case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
////		case "firefox": capabilities.setBrowserName("firefox"); break;
////		default: System.out.println("No matching browser"); return;
////		}
////		
////		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
////	}
////			
////	else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
////	{
////
////		switch(br.toLowerCase())
////		{
////		case "chrome" : 
////			ChromeOptions options = new ChromeOptions();
////
////			// ✅ Point to the full user data directory
////			
////
////			// ✅ Use the custom profile you created
////			options.addArguments("user-data-dir=C:\\Users\\Diksha\\selenium-profile");
////			options.addArguments("--remote-allow-origins=*");
////
////			WebDriver driver = new ChromeDriver(options);
////
////			
////
////		    break;
////
////		case "edge" : driver=new EdgeDriver(); break;
////		case "firefox": driver=new FirefoxDriver(); break;
////		default : System.out.println("Invalid browser name.."); return;
////		}
////	}
////	
////		
////	driver.manage().deleteAllCookies();
////	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////	
////	driver.get(p.getProperty("appUrl")); // reading url from properties file.
////	driver.manage().window().maximize();
////}
////	
////	@AfterClass
////	public void tearDown() {
////		driver.quit();
////	}
////
////	public String randomString() {
////		String genRandomStr = RandomStringUtils.randomAlphabetic(5);
////		return genRandomStr;
////	}
////	
////	public String randomNumber() {
////		String genRandomStr = RandomStringUtils.randomAlphanumeric(10);
////		return genRandomStr;
////		
////	}
////	
////	public String randomStrNum() {
////		String genRandomStr = RandomStringUtils.randomAlphabetic(3);
////		String genRandomNum = RandomStringUtils.randomAlphanumeric(3);
////		String genRandomStrNum = genRandomStr + "@" + genRandomNum;
////		
////		return genRandomStrNum;
////		
////	}
////	
////	public String captureScreen(String tname) throws IOException {
////
////		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
////				
////		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
////		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
////		
////		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
////		File targetFile=new File(targetFilePath);
////		
////		sourceFile.renameTo(targetFile);
////			
////		return targetFilePath;
////
////	}
////
////}
//
//package testBase;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.time.Duration;
//import java.util.Date;
//import java.util.Properties;
//import java.util.ResourceBundle;
//
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//
//public class BaseClass {
//
//    public static WebDriver driver;
////    public Logger logger;
//    public Properties p;
//    public Logger logger = LogManager.getLogger(this.getClass());
//    public ResourceBundle rb = ResourceBundle.getBundle("config");
//
//    @BeforeClass(groups = {"Sanity", "Regression", "Master"})
//    @Parameters({"os", "browser"})
//    public void setup(String os, String br) throws IOException {
//        // Load config.properties file
//        FileReader file = new FileReader("./src/test/resources/config.properties");
//        p = new Properties();
//        p.load(file);
//
//        logger = LogManager.getLogger(this.getClass());  // log4j2
//
//        if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//
//            // Set platform
//            switch (os.toLowerCase()) {
//                case "windows": capabilities.setPlatform(Platform.WIN11); break;
//                case "linux": capabilities.setPlatform(Platform.LINUX); break;
//                case "mac": capabilities.setPlatform(Platform.MAC); break;
//                default:
//                    System.out.println("No matching OS");
//                    return;
//            }
//
//            // Set browser
//            switch (br.toLowerCase()) {
//                case "chrome": capabilities.setBrowserName("chrome"); break;
//                case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
//                case "firefox": capabilities.setBrowserName("firefox"); break;
//                default:
//                    System.out.println("No matching browser");
//                    return;
//            }
//
//            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
//        }
//
//        else if (p.getProperty("execution_env").equalsIgnoreCase("local")) {
//            switch (br.toLowerCase()) {
//                case "chrome":
//                    ChromeOptions options = new ChromeOptions();
//                    options.addArguments("user-data-dir=C:\\Users\\Diksha\\selenium-profile");
//                    options.addArguments("--remote-allow-origins=*");
//                    driver = new ChromeDriver(options); // ✅ Fixed: no 'WebDriver' declaration here
//                    break;
//
//                case "edge":
//                    driver = new EdgeDriver();
//                    break;
//
//                case "firefox":
//                    driver = new FirefoxDriver();
//                    break;
//
//                default:
//                    System.out.println("Invalid browser name.");
//                    return;
//            }
//        }
//
//        // Common setup
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get(p.getProperty("appUrl"));
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    public String randomString() {
//        return RandomStringUtils.randomAlphabetic(5);
//    }
//
//    public String randomNumber() {
//        return RandomStringUtils.randomAlphanumeric(10);
//    }
//
//    public String randomStrNum() {
//        String genRandomStr = RandomStringUtils.randomAlphabetic(3);
//        String genRandomNum = RandomStringUtils.randomAlphanumeric(3);
//        return genRandomStr + "@" + genRandomNum;
//    }
//
//    public String captureScreen(String tname) throws IOException {
//        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//        String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
//        File targetFile = new File(targetFilePath);
//        sourceFile.renameTo(targetFile);
//        return targetFilePath;
//    }
//}
//
package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import utilities.ChromeProfileManagerUtility; // ✅ Import your utility class

public class BaseClass {

    public static WebDriver driver;
    public Properties p;
    public Logger logger = LogManager.getLogger(this.getClass());
    public ResourceBundle rb = ResourceBundle.getBundle("config");

    @BeforeClass(groups = {"Sanity", "Regression", "Master"})
    @Parameters({"os", "browser"})
    public void setup(String os, String br) throws IOException {
        // Load properties
        FileReader file = new FileReader("./src/test/resources/config.properties");
        p = new Properties();
        p.load(file);

        logger.info("Starting tests on " + br + " in " + os + " environment.");

        if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            switch (os.toLowerCase()) {
                case "windows": capabilities.setPlatform(Platform.WIN11); break;
                case "linux": capabilities.setPlatform(Platform.LINUX); break;
                case "mac": capabilities.setPlatform(Platform.MAC); break;
                default:
                    System.out.println("Unsupported OS."); return;
            }

            switch (br.toLowerCase()) {
                case "chrome": capabilities.setBrowserName("chrome"); break;
                case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
                case "firefox": capabilities.setBrowserName("firefox"); break;
                default:
                    System.out.println("Unsupported browser."); return;
            }

            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        }

        else if (p.getProperty("execution_env").equalsIgnoreCase("local")) {
            switch (br.toLowerCase()) {
            case "chrome":
                driver = ChromeProfileManagerUtility.createChromeWithClonedAdBlockProfile();
                break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                default:
                    System.out.println("Unsupported browser."); return;
            }
        }

        // Common WebDriver setup
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("appUrl"));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String randomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public String randomNumber() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    public String randomStrNum() {
        return RandomStringUtils.randomAlphabetic(3) + "@" + RandomStringUtils.randomAlphanumeric(3);
    }

    public String captureScreen(String tname) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destPath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
        File dest = new File(destPath);
        src.renameTo(dest);
        return destPath;
    }
}
