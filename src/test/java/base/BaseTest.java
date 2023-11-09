package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.HomePage;

import java.io.IOException;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;



    @BeforeClass
    public void setUp() throws IOException {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
        //Open page URL
        driver.get("https://subscribe.stctv.com/");

        homePage = new HomePage(driver);


    }
        @AfterClass
        public void tearDown(){
            driver.quit();
        }


    }




