package Banking;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import net.anthavio.phanbedder.Phanbedder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class AppTest2 {
  private RemoteWebDriver driver;

@Test
  public void test2() throws MalformedURLException {
    //Create instance of PhantomJS driver

	 File phantomjs = Phanbedder.unpack();
     DesiredCapabilities dcaps = new DesiredCapabilities();
     dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs.getAbsolutePath());
     PhantomJSDriver driver = new PhantomJSDriver(dcaps);
 
    //Navigate to the pageasd
     driver.get("https://www.google.com");
    
  }
}