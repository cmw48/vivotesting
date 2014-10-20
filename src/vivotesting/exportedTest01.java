package vivotesting;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exportedTest01 {

  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/vivo";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

//for normal addition 
@Test
public void testAdd1Plus1() 
{
    int x  = 1 ; int y = 1;
    int  z;
    z = x + y;
    System.out.println("Sum of entered integers = "+z);
    assertEquals(2, z);
//    return z;
// return b;
}
  


@Test
  public void testCheckFrontPage() throws Exception {
    // Check Front Page
    // ERROR: Caught exception [ERROR: Unsupported command [deleteAllVisibleCookies |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 100000000000 | ]]
    //driver.get(baseUrl + "${myURL}");
	driver.get("http://agcensus.mannlib.cornell.edu/AgCensus/");
	Thread.sleep(50000);
    assertEquals("USDA Census of Agriculture Historical Archive", driver.getTitle());
    // Check header
    try {
        assertEquals("Census of Agriculture Historical Archive", driver.findElement(By.id("home-link")).getText());
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
     // Check left side of page
      try {
        assertEquals("Search the Census", driver.findElement(By.cssSelector("h3.first")).getText());
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
      try {
          assertTrue(isElementPresent(By.name("search_term")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("Search", driver.findElement(By.name("btnG")).getAttribute("value"));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("Census by Year", driver.findElement(By.xpath("//div[@id='sidebar']/h3[2]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1987")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1982")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1978")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1974")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1969")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        
        try {
          assertTrue(isElementPresent(By.linkText("1964")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1959")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1954")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1945")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1940")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1936")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("1925")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("Census by Area", driver.findElement(By.xpath("//div[@id='sidebar']/h3[3]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.cssSelector("input.submit")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        // Check middle of page
        try {
          assertEquals("The USDA Census of Agriculture Historical Archive is a collaborative project between Albert R. Mann Library at Cornell University and the National Agricultural Statistics Service (NASS) of the U.S. Department of Agriculture.", driver.findElement(By.cssSelector("p")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("The site serves as a public archive of Census publications published prior to 1987. These publications are primarily scanned print material now available in PDF format.", driver.findElement(By.xpath("//div[@id='content']/p[2]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("This site is an ongoing work in progress as we digitize and structure the Census of Agriculture from 1987 back to 1840. We have met our goal of past census back to 1925 online by the end of 2011. Our next target is to complete the censuses back to 1840 and to refine our search results to include sorting by regions, states, and years.", driver.findElement(By.xpath("//div[@id='content']/p[3]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("For earlier and more recent Census publications visit the USDA NASS Census of Agriculture site.", driver.findElement(By.xpath("//div[@id='content']/p[4]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("USDA NASS Census of Agriculture site")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        // Check top navigation bar
        try {
          assertTrue(isElementPresent(By.linkText("Home")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("About the Census")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("Help")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("Contact Us")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        // Check footer
        try {
          assertTrue(isElementPresent(By.linkText("usda-help@cornell.edu")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("USDA Census of Agriculture Historical Archive")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("Albert R. Mann Library")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.linkText("Cornell University")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertEquals("Comments and questions to usda-help@cornell.edu", driver.findElement(By.xpath("//div[@id='footer']/p[3]")).getText());
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }
        try {
          assertTrue(isElementPresent(By.cssSelector("img[alt=\"Mann Library logo\"]")));
        } catch (Error e) {
          verificationErrors.append(e.toString());
        }

        
        // Go back to starting position
        driver.get("http://agcensus.mannlib.cornell.edu/AgCensus/");
        assertEquals("USDA Census of Agriculture Historical Archive", driver.getTitle());
      }

 
  
@After
public void tearDown() throws Exception {
  driver.quit();
  String verificationErrorString = verificationErrors.toString();
  if (!"".equals(verificationErrorString)) {
    fail(verificationErrorString);
  }
}

private boolean isElementPresent(By by) {
  try {
    driver.findElement(by);
    return true;
  } catch (NoSuchElementException e) {
    return false;
  }
}

private boolean isAlertPresent() {
  try {
    driver.switchTo().alert();
    return true;
  } catch (NoAlertPresentException e) {
    return false;
  }
}

private String closeAlertAndGetItsText() {
  try {
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    if (acceptNextAlert) {
      alert.accept();
    } else {
      alert.dismiss();
    }
    return alertText;
  } finally {
    acceptNextAlert = true;
  }
}


}
