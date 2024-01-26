import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the GeckoDriver executable
      //  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        // Initialize the FirefoxDriver
        driver = new FirefoxDriver();
     ////    driver = new ChromeDriver();
         

    }

    @Test
    public void openBrowser() {
        // Navigate to a website
        driver.get("https://webapps.tekstac.com/SeleniumApp2/Library/LibraryCard.html");

        // Perform some actions or assertions if needed
        // For example, you can check the title of the page
       String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }

    @AfterClass
    public void tearDown() {
    	System.out.println("Page Title: browser should remain open " );
    }
}
