package lekcijaSeptini.labDarbs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {



    @Test
    public void testLoginWrongUsernameAndPassword() {
        testLogin("asdasdasda","asdasdasdsa",
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() {
        testLogin("","", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword () {
        testLogin("", "dfsdfsdfsd", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameAndEmptyPassword () {
        testLogin("testtest", "", "Epic sadface: Password is required");
    }



    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys(username);

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);
    }

}
