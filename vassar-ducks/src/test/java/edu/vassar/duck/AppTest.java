package edu.vassar.duck;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    MallardDuck mall = new MallardDuck();
    String flyMall = mall.performFly();
    String actualFlyMall = "I'm flying with a rocket!";
    
    @Test
    public void testFlyMall() {
        System.out.println("@Test performFly(): " + flyMall + " = "
               + actualFlyMall);
                
        assertEquals (flyMall, actualFlyMall);
    }
    
    
    RedheadDuck redhd = new RedheadDuck();
    String flyRedhd = redhd.performFly();
    String actualFlyRedhd = "I can fly with wings!";
    
    @Test
    public void testFlyRedhd() {
       System.out.println("@Test performFly(): " + flyRedhd + " = "
               + actualFlyRedhd);
                
        assertEquals (flyRedhd, actualFlyRedhd);
    }
    
   
    ModelDuck model = new ModelDuck();
    String flyModel = model.performFly();
    String actualFlyModel = "I can't fly!";
    
    @Test
    public void testFlyModel() {
       System.out.println("@Test performFly(): " + flyModel + " = "
               + actualFlyModel);
                
        assertEquals (flyModel, actualFlyModel);    
    }
    
  
    RubberDuck rubber = new RubberDuck();
    String flyRubber = rubber.performFly();
    String actualFlyRubber = "I can't fly!"; 
    
    @Test
    public void testFlyRubber() {
        
    }
            
            
    DecoyDuck decoy = new DecoyDuck();
    
    
   
    
}
