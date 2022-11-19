package stepdefinitions;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass
{
   @Before
   public void beforescenario()
   {
	   System.out.println("this will run before the scenario");
   }
   @After
   public void before_or_after( )
   {
	   
   }
}
