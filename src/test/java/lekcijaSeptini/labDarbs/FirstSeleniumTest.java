package lekcijaSeptini.labDarbs;


import elements.DatePicker;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstSeleniumTest extends BaseTest {

   DatePicker datePicker;

   @BeforeMethod
   public void setUpTest(){
      parluks.navigate().to("https://www.allphptricks.com/demo/2018/april/jquery-datepicker-with-icon/");
       datePicker = new DatePicker(parluks);
   }

   @AfterMethod
   public void tearDownBrowser(){
      parluks.quit();
   }

   @Test
    public void testFirstWebPage(){
      datePicker.setDate("2",4,"1993");
   }

   @Test
   public void testPageTitle(){
      String nosaukums = parluks.getTitle();
      Assert.assertEquals(nosaukums,"Latvijas Universitāte");
   }

   @Test
   public void testRandom(){

   }

}
