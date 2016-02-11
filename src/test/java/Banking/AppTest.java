package Banking;

import org.testng.annotations.Test;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
 
public class AppTest {
  @Test
  public void testSearchReturnsResults() {
    //Create instance of PhantomJS driver

	  File file = new File("D:\\Tools\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
  	System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
 	    WebDriver driver = new PhantomJSDriver();
 
    //Navigate to the pageasd
    driver.get("http://www.appneta.com/");
    
  }
}