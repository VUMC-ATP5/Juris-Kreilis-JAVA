package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @Given("I have navigated to login screen")
    public void iHaveNavigatedToLoginScreen() {
        driver.navigate().to("http://www.google.lv");
        System.out.println("test");
    }

    @After
    public void tearDown() {
   driver.quit();
    }

}
