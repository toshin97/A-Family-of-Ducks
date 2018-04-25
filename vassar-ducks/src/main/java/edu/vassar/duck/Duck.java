
package edu.vassar.duck;

/**
 *
 * @author Tahsin Oshin
 */


public abstract class Duck {

   
    // variables defining the duck name, type and method of flying is declared
    String name = "duck";
    String type = "ducktype";
    
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    
    //method defining if the duck can swim
    public String swim() {
        String sm = "I am Mr. "+name+" of the "+type+" class of "
                + "ducks and I am swimming.";
        System.out.println(sm);
        return sm;
    }
    
    //method defining if the duck can quack
    public String performQuack() {
        
       String quack = quackBehavior.quack();
       return quack; 

    }
    
    //method defining if the duck can fly
    public String performFly() {
        String fly = flyBehavior.fly();
        return fly;
    }
    
    //main method calls and test the different bird attributes
    
    public static void main(String[] args) {
        
        //objects of the various duck type classes are created to call on the 
        //methods
    MallardDuck mall = new MallardDuck();
    RedheadDuck redhd = new RedheadDuck();
    RubberDuck rubbr = new RubberDuck();
    DecoyDuck decoy = new DecoyDuck();
    ModelDuck model = new ModelDuck();
  
    
    //calling methods on the duck types
    System.out.println(mall);
    mall.swim();
    mall.performQuack(); 
    mall.performFly();
    
    System.out.println();
    
    System.out.println(redhd);
    redhd.swim();
    redhd.performQuack();
    redhd.performFly(); 

    
    System.out.println();
    
    System.out.println(rubbr);
    rubbr.swim();
    rubbr.performQuack();
    rubbr.performFly();
    
    System.out.println();
    
    System.out.println(decoy);
    decoy.swim();
    decoy.performQuack();
    decoy.performFly();
   
    System.out.println();
    
    //the flytype is specified in a new method setFly implemented
    //in ModelDuck class
    System.out.println(model);
    model.swim();
    model.performQuack();
    model.performFly();
    
    
    }
    
    
    
}
    

