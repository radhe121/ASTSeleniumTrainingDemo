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
       
      System.out.println("launching Chrome browser"); 
      System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SelniumJars_Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
      //ff
  }
}
