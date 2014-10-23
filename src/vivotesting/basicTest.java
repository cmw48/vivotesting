package vivotesting;

import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import org.junit.Test;


public class basicTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         System.out.println("SCC Initialization successful.");
         String searchText = "";
         String query = "";
         String answer = "";
//         Integer replyMsg = "";
         searchText = "Krafft, D";
         //reply = SearchVivoForString(searchText);
        // exportedTest01 et1 = new exportedTest01();  
         checkIfOnePlusOneIsTwo();
         tryToDoAgCensus();
         //checkIfLastNameIsInVivo(searchText);
        // System.out.println("The answer is " + replyMsg + ".");
         answer = SearchWebApp(searchText);
	}
	
	@Test
	public static void checkIfOnePlusOneIsTwo(){
		exportedTest01 et1 = new exportedTest01();  
        et1.testAdd1Plus1();
	}

	@Test
	public static void tryToDoAgCensus() throws Exception{
		exportedTest01 et2 = new exportedTest01();  
        et2.testCheckFrontPage();
	}
	
	@Test
	public static void checkIfLastNameIsInVivo(String searchText){
	String baseurl = "http://vivo.cornell.edu";
     WebDriver driver = new FirefoxDriver(); 	
   	 WebElement searchBox;
   	 WebElement profileLink = null;
	    try {
	    	driver.get(baseurl);
	        searchBox = driver.findElement(By.name("querytext"));
	         searchBox.sendKeys(searchText);
	         searchBox.submit();
	         try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	         profileLink = driver.findElement(By.partialLinkText(searchText));
	         profileLink.click();     
	         
	    }
	    catch (NoSuchElementException e) {
	        Assert.fail("Web page is not properly set up! " + e.getMessage());
	    }
	    Assert.assertNotNull(profileLink);
	    Assert.assertEquals("The current date is not displayed", profileLink.isDisplayed());
	}
		

	public static String SearchVivoForString(String searchText) {
	  String answer = "";
	  String reply = "";
	  System.out.println("Hi there! This is Eddie.");
	  //System.out.println("Hi there. This is Eddie, your shipboard computer, and I'm feeling just great, guys," );
	  //System.out.println("and I know I'm just going to get a bundle of kicks out of any program you care to run through me.");
	   System.out.println("You just asked me, Is " + searchText + " in VIVO?  I'll go look...");
	   answer = SearchWebApp(searchText);
	   
	   System.out.println("I looked on the webapp, and the answer is " + answer + ".");
		return reply = answer;
	}

	public static String SearchWebApp(String person)  {
	 String answer = "";
	 WebDriver driver = new FirefoxDriver(); 
	 String url = "";
	 String  id = "vcard.foaf-person.fn";
	 url = "http://vivo.cornell.edu:8080/display/individual22669?destination=standardView";
	 try {
	 driver.get(url);
     //WebElement link;
     WebElement link = driver.findElement(By.linkText("Operations Research and Information Engineering"));
     link.click();
     Thread.sleep(5000);
     WebElement searchBox;
     searchBox = driver.findElement(By.name("querytext"));
     searchBox.sendKeys(person);
     searchBox.submit();
     Thread.sleep(5000);
     
     //List<WebElement> profileLink;
    WebElement profileLink = driver.findElement(By.partialLinkText(person));
     profileLink.click();     
     
     Thread.sleep(5000);
     String labelStringName = "";
     String labelString;
     //WebElement label;
     WebElement label;
      label = driver.findElement(By.xpath("//*[@class='vcard foaf-person fn']"));
     //label = driver.findElement(By.className("vcard.foaf-person.fn"));
     //label = driver.findElement(By.id("individual-info"));
     String labelClassString = "";
     Object labelClass = "";

	 labelString = label.getText();
	

	//labelClassName = label.findElement(By.className("foaf-person"));
    // labelClassString = labelClassName.toString();
    // labelName = label.getText();
     //Class labelClass = label.getClass();
    //String labelName = labelClass.getName();

    System.out.println(labelString);
    
     driver.quit();
	 } catch ( Exception e ) {
			System.out.println("Blammo! Hit a snag.  Error" + e);
			throw(e);
	 } finally {
		 return answer;
	 }
	 
	 }
	

	
}


/***
      // Sleep until the div we want is visible or 5 seconds is over
        long end = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < end) {
            WebElement resultsDiv = driver.findElement(By.className("gssb_e"));

            // If results have been returned, the results are displayed in a drop down.
            if (resultsDiv.isDisplayed()) {
              break;
            }
        }

        // And now list the suggestions
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));
        
        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }

        driver.quit();
    }
***/