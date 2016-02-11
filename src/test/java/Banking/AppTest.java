package Banking;

import org.testng.annotations.Test;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class AppTest {
  @Test
  public void testSearchReturnsResults() {
    //Create instance of PhantomJS driver

	  DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
	    PhantomJSDriver driver = new PhantomJSDriver(capabilities);
 
    //Navigate to the pageasd
    driver.get("http://www.appneta.com/");
    
  }
}