package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DatePicker extends AbstractComponent {

    @FindBy(css = "img.ui-datepicker-trigger")
    private WebElement calendarIcon;

    @FindBy(css = "ui-datepicker-div")
    private WebElement datePickerWidget;

    @FindBy(className = "ui-datepicker-month")
    private WebElement datePickerMonth;

    @FindBy(className = "ui-datepicker-year")
    private WebElement datePickerYear;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    private List<WebElement> datePickerDay;

    public DatePicker(WebDriver driver) {
      super(driver);
    }

    public void setDate(String month, int day, String year) {
        this.calendarIcon.click();
        Select monthSelect = new Select(datePickerMonth);
        Select yearSelect = new Select(datePickerYear);
        monthSelect.selectByValue(month);
        yearSelect.selectByValue(year);
        clickOnDayByIndex(day);
    }

    private void clickOnDayByIndex(int index) {
        datePickerDay.get(index - 1).click();
    }


    @Override
    public boolean isDisplayed() {
       return  this.wait.until((d) -> this.datePickerWidget.isDisplayed());
    }

}
