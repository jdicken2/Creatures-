/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

/**
 *
 * @author djnig
 */
public class testCreatureJUnitTest
{
    
    private ByteArrayOutputStream println = new ByteArrayOutputStream();
    private PrintStream oldSystemOut = System.out;
    
    //Generic Things and Creatures to be eaten or to eat
    Thing thing1=new Thing("thing1");
    Ant ant1=new Ant("ant1");
    Bat bat1=new Bat("bat1");
    Fly fly1=new Fly("fly1");
    Tiger tiger1=new Tiger("tiger1");

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(println));
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut(oldSystemOut);
    }

    // Move tests
    //Ant Move Test
    @Test
    public void antMoveTest()
    {
        //Tests to see if the Ant Object moves by crawling 
        Ant mAnt=new Ant("mAnt");
        mAnt.move();
        assertEquals(mAnt + " " +"is crawling around\n",println.toString());
    }
    //Bat Move Test
    @Test
    public void batMoveTest()
    {
        //Tests to see if Bat Object moves by swooping through the dark
        Bat mBat=new Bat("mBat");
        mBat.move();
        assertEquals(mBat + " " +"is swooping through the dark\n",println.toString());
    }
    //Fly Move Test
    @Test
    public void flyMoveTest()
    {
       //Tests to see if Fly object moves by buzzing
        Fly mFly=new Fly("mFly");
        mFly.move();
        assertEquals(mFly + " " +"is buzzing around in flight\n",println.toString());
    }
        
    //Tiger move() Test
    @Test
    public void tigerMoveTest()
    {
        //Tests to see if the Tiger Object moves by pouncing 
        Tiger mTiger=new Tiger("mTiger");
        mTiger.move();
        assertEquals(mTiger + " " +"has just pounced\n",println.toString());
    }
    
    //Ant eat() and whatDidYouEat() Tests
    @Test
    public void antThingEatTest()
    {
        //Tests to see if an Ant Object eats a Thing instance
        Ant fullAnt1=new Ant();
        fullAnt1.eat(thing1);
        assertEquals(fullAnt1.getName() + " " +"has just eaten thing1\n",println.toString());
    }
    
    @Test
    public void antAntEatTest()
    {
       //Tests to see if an Ant Object eats an Ant instance 
       Ant fullAnt2=new Ant();
       fullAnt2.eat(ant1);
       assertEquals(fullAnt2.getName() + " " +"has just eaten ant1 Ant\n",println.toString());
    }
    
    @Test
    public void antBatEatTest()
    {
       //Tests to see if an Ant Object eats a Bat instance 
      Ant fullAnt3=new Ant();
      fullAnt3.eat(bat1);
      assertEquals(fullAnt3.getName() + " " +"has just eaten bat1 Bat\n",println.toString());
    }
    
    @Test
    public void antFlyEatTest()
    {
      //Tests to see if an Ant Object eats a Fly instance  
      Ant fullAnt4=new Ant();
      fullAnt4.eat(fly1);
      assertEquals(fullAnt4.getName() + " " +"has just eaten fly1 Fly\n",println.toString());
    }
    
    @Test
    public void antTigerEatTest()
    {
        //Tests to see if an Ant Object eats a Tiger instance 
       Ant fullAnt5=new Ant();
       fullAnt5.eat(tiger1);
       assertEquals(fullAnt5.getName() + " " +"has just eaten tiger1 Tiger\n",println.toString());  
    }
    
    @Test 
    public void antFullWhatDidYouEat()
    {
        //Tests full Ant whatDidYouEat()
        tiger1.eat(thing1);
        println.reset();
        tiger1.whatDidYouEat();
        assertEquals(tiger1 + " " + "has eaten thing1\n", println.toString());
    }
    
    @Test
    public void antEmptyWhatDidYouEat()
    {
        //Tests empty Ant whatDidYouEat()
        Ant emptyAnt=new Ant("emptyAnt");
        emptyAnt.whatDidYouEat();
        assertEquals(emptyAnt + " " +  "has had nothing to eat!\n", println.toString());
    }
    //Bat eat() and whatDidYouEat() Tests
    @Test
    public void batThingEatTest()
    {
        //Tests if Bat will eat a Thing instance
        Bat fullBat1=new Bat("fullBat1");
        fullBat1.eat(thing1);
        assertEquals(fullBat1 + " " +  "won't eat thing1" + " " +"because it is not a Creature\n", println.toString());
    }
    
    @Test
    public void batAntEatTest()
    {
        //Tests if Bat will eat an Ant instance
        Bat fullBat2=new Bat("fullBat2");
        fullBat2.eat(ant1);
        assertEquals(fullBat2 + " " + "ate ant1 Ant\n", println.toString());
    }
    
    @Test
    public void batBatEatTest()
    {
        //Tests if Bat will eat a Bat instance
        Bat fullBat3=new Bat("fullBat3");
        fullBat3.eat(bat1);
        assertEquals(fullBat3 + " " + "ate bat1 Bat\n",println.toString());
    }
    
    @Test
    public void batFlyEatTest()
    {
        //Tests if Fly will eat a Fly instance
        Bat fullBat4=new Bat("fullBat4");
        fullBat4.eat(fly1);
        assertEquals(fullBat4 + " " + "ate fly1 Fly\n",println.toString());
    }
    
    
    @Test
    public void batTigerEatTest()
    {
        //Tests if Bat will eat a Tiger instance
        Bat fullBat5=new Bat("fullBat5");
        fullBat5.eat(tiger1);
        assertEquals(fullBat5+ " " + "ate tiger1 Tiger\n",println.toString());
    }
    
    @Test
    public void batFullWhatDidYouEat()
    {
        //Tests full Bat whatDidYouEat()
        bat1.eat(ant1);
        println.reset();
        bat1.whatDidYouEat();
        assertEquals(bat1 + " " + "has eaten ant1 Ant\n", println.toString());
    }
    
    @Test
    public void batEmptyWhatDidYouEat()
    {
        //Tests empty Bat whatDidYouEat()
        Bat emptyBat=new Bat("emptyBat");
        emptyBat.whatDidYouEat();
        assertEquals(emptyBat + " " +  "has had nothing to eat!\n", println.toString());
    }
    
    //Fly eat() and whatDidYouEat() methods
    @Test
    public void flyThingEatTest()
    {
        //Tests Fly eating Thing instance
        Fly fullFly1=new Fly("fullFly1");
        fullFly1.eat(thing1);
        assertEquals(fullFly1 + " " + "has just eaten thing1\n",println.toString());
    }
    
    @Test
    public void flyAntEatTest()
    {
        //Tests Fly eating Ant instance
        Fly fullFly2=new Fly("fullFly2");
        fullFly2.eat(ant1);
        assertEquals(fullFly2 + " " + "won't eat ant1 Ant because it is a Creature\n",println.toString());   
    }
    
    @Test
    public void flyBatEatTest()
    {
        //Tests Fly eating Bat instance
        Fly fullFly3=new Fly("fullFly3");
        fullFly3.eat(bat1);
        assertEquals(fullFly3 + " " + "won't eat bat1 Bat because it is a Creature\n",println.toString());    
    }
    
    @Test
     //Tests Fly eating Fly instance
    public void flyFlyEatTest()
    {
        Fly fullFly4=new Fly("fullFly4");
        fullFly4.eat(fly1);
        assertEquals(fullFly4 + " " + "won't eat fly1 Fly because it is a Creature\n",println.toString());    
    }
    
    @Test
    //Tetss Fly eating Tiger instance
    public void flyTigerEatTest()
    {
        Fly fullFly5=new Fly("fullFly5");
        fullFly5.eat(tiger1);
        assertEquals(fullFly5 + " " + "won't eat tiger1 Tiger because it is a Creature\n",println.toString());
        
    }
    //Tiger eat() and whatDidYouEat() Tests
    @Test
    public void tigerThingEatTest()
    {
        //Tests to see if a Tiger Object eats a Thing instance
        Tiger fullTiger1=new Tiger("fullTiger1");
        fullTiger1.eat(thing1);
        assertEquals(fullTiger1.getName() + " " + "has just eaten thing1\n", println.toString());
    }
    
   
    
    @Test
    public void tigerAntEatTest()
    {
      //Tests to see if a Tiger Object eats an Ant instance
        Tiger fullTiger2=new Tiger("fullTiger2");
        fullTiger2.eat(ant1);
        assertEquals(fullTiger2.getName() + " " + "has just eaten ant1 Ant\n", println.toString());
    }
    
    @Test
    public void tigerBatEatTest()
    {
        //Tests to see if a Tiger object eats a Bat instance
        Tiger fullTiger3=new Tiger("fullTiger3");
        fullTiger3.eat(bat1);
        assertEquals(fullTiger3.getName() + " " + "has just eaten bat1 Bat\n", println.toString());
    }
    
    @Test
    public void tigerFlyEatTest()
    {
        //Tests to see if Tiger objects eat a Fly instance
        Tiger fullTiger4=new Tiger("fullTiger4");
        fullTiger4.eat(fly1);
        assertEquals(fullTiger4.getName() + " " + "has just eaten fly1 Fly\n", println.toString());
    }
    
    @Test
    public void tigerTigerEatTest()
    {   
       //Tests to see if Tiger object eats a Tiger instance
        Tiger fullTiger5=new Tiger("fullTiger5");
        fullTiger5.eat(tiger1);
        assertEquals(fullTiger5.getName() + " " + "has just eaten tiger1 Tiger\n", println.toString());
    }
    
    @Test
    public void tigerFullWhatDidYouEat()
    {
        //Tests full Tiger whatDidYouEat()
        tiger1.eat(thing1);
        println.reset();
        tiger1.whatDidYouEat();
        assertEquals(tiger1 + " " + "has eaten thing1\n", println.toString());
    }
    
    @Test
    public void tigerEmptyWhatDidYouEat()
    {
        //Tests empty Tiger whatDidYouEat()
        Tiger emptyTiger=new Tiger("emptyTiger");
        emptyTiger.whatDidYouEat();
        assertEquals(emptyTiger + " " +  "has had nothing to eat!\n", println.toString());
    }
 
}
    

