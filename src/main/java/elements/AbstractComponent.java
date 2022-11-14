package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public abstract class AbstractComponent {
    WebDriver driver;
    protected WebDriverWait wait;

    public AbstractComponent(WebDriver driver){
        this.wait = new WebDriverWait(driver, Duration.of(30, SECONDS));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isDisplayed();

}
