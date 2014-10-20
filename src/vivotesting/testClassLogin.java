package vivotesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testClassLogin {

   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      message = "Monkey nuts.";	   
      assertEquals(message,messageUtil.printMessage());
   }
}
