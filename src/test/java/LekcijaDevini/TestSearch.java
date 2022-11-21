package LekcijaDevini;

import org.testng.annotations.Test;

public class TestSearch extends BaseTest {

    @Test
    public void testSearchFunctionality() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsīni");
        Thread.sleep(5000);
    }
}
