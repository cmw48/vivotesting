README:  Java project for JUnit and Selenium Server testing
cmw48 - Cornell University 

For testing that can't be accomplished by Selenium scripts, write 
JUnit tests and parameterized Selenium tests written in Java.

Example: 
1) Query VIVO for a list of all persons (or subset of persons - Emeriti?)
2) create a model in Java and load the person nodes
3) iterate through all the nodes in the module 
4) use the local name to check each persons' vivo page
5) do something programatically with Selenium to check elements for each node in the model


Test Fixture: fixed state of software and inputs for testing.

Functional Tests: walk through a user story and test for problems that users of the application may encounter.

State Tests: test the methods/calls for the expected results. Verify algorithms or system functionality.

Behaviour Tests: checks if certain methods were called with the correct input parameters.


//more hints at http://www.vogella.com/tutorials/JUnit/article.html

/***
* Define Test Suite
 package packageName;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyClassTest.class, MySecondClassTest.class })
public class AllTests {

} 
***/

/***
package packageName;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(MyClassTest.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
} ***/