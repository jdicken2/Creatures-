public class TestCreature extends Object
{
	
	public static final int THING_COUNT=10;
	public static final int CREATURE_COUNT=6;
	//int index=0;	

	public static void main (String [] args)
	{
		//Create Thing and Creature Array
		Thing t[]=new Thing[THING_COUNT]; 
		Creature c[]=new Creature[CREATURE_COUNT];

		//Fill Thing Array
		Thing thing1=new Thing("thing1");
		Thing thing2=new Thing("thing2");
		Thing thing3=new Thing("thing3");
		Thing thing4=new Thing("thing4");
		Thing thing5=new Thing("thing5");

		Tiger tiger1=new Tiger("tiger1");
		Tiger tiger2=new Tiger("tiger2");
		Tiger tiger3=new Tiger("tiger3");
		Tiger tiger4=new Tiger("tiger4");
		Tiger tiger5=new Tiger("tiger5");
		
		t[0]=thing1;
		t[1]=thing2;
		t[2]=thing3;
		t[3]=thing4;
		t[4]=thing5;

		t[5]=tiger1;
		t[6]=tiger2;
		t[7]=tiger3;
		t[8]=tiger4;
		t[9]=tiger5;

		//Fill Creature Array
		Ant ant1=new Ant("ant1");
		Ant ant2=new Ant("ant2");
		Bat bat1=new Bat("bat1");
		Bat bat2=new Bat("bat2");
		Fly fly1=new Fly("fly1");
		Fly fly2=new Fly("fly2");


		c[0]=ant1;
		c[1]=ant2;
		c[2]=bat1;
		c[3]=bat2;
		c[4]=fly1;
		c[5]=fly2;


		//Prints a heading "Things:" followed by a blank line
		System.out.println("Things:");
		System.out.println(" ");

		//Iterate through Things Array and Print Each Thing
		for(int k=0;k<THING_COUNT;k++)
		{
			System.out.println(t[k]);
		}

		//Print a blank line
		System.out.println(" ");

		//Print a heading "Creatures:" followed by a blank line
		System.out.println("Creatures:");
		System.out.println(" ");

		//Iterate through Creatures Array and Print each Creature
		for(int j=0;j<CREATURE_COUNT;j++)
		{
			System.out.println(c[j]);
		}

		//Print a blank line
		System.out.println(" ");


		//Validate the operation of Creature functions
		//Start with the Tiger class
		//Tigers eat Things and Creatures. One eat function will suffice:
		tiger1.eat(thing1);
		//Test move
		tiger1.move();
		//Test full whatDidYouEat
		tiger1.whatDidYouEat();
		//Test empty Tiger whatDidYouEat 
		tiger2.whatDidYouEat();


		//Ant class
		//Ants eat Things and Creatures. One eat funciton will suffice.
		ant1.eat(thing2);
		//Test move
		ant1.move();
		//Test full whatDidYouEat
		ant1.whatDidYouEat();
		//Tests empty whatDidYouEat
		ant2.whatDidYouEat();

		//Fly class
		//First Fly Object Eats Thing
		fly1.eat(thing3);
		//Second Fly Objects Eats Creature
		fly2.eat(ant1);
		//Move Function
		fly1.move();
                //Test full whatDidYouEat
		fly1.whatDidYouEat();
		//Test empty whatDidYouEat
		fly2.whatDidYouEat();

		//Bat
		//Eats a Thing that is not a Creature
		bat1.eat(thing4);
		//Eats a Creature
		bat2.eat(fly2);
		//Move
		bat1.move();
		//Test full whatDidYouEat
		bat2.whatDidYouEat();
		//Test empty
		bat1.whatDidYouEat(); 

	}
}