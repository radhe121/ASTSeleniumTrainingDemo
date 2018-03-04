package demo.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
      //PropertyConfigurator.configure("log4j.properties");
	 // Logger logger = Logger.getLogger("verifyHomepageTitle");
	    
 
     // logger.info("launching Chrome browser"); 
      
      System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SelniumJars_Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
     // logger.info("launched flight URL");
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      //logger.info("title is capture");
      driver.close();
      //ffff
  }
}
