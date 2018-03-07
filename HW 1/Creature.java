public abstract class Creature extends Thing
{
	//Empty indicates whether the Creature has eaten
		//Returns true if the creature has not eaten
		//returns false if the creature has eaten 
	//Content indicates the Thing that is inside the Creature's stomach
    boolean empty=true;
    Thing content;

    //Default Constructor (inherits from Thing)
	public Creature()
	{
		super();
	}	

	//Nondefault Constructor (inherits from Thing)
	public Creature(String na)
	{
		super(na);
	}

	//Eat function
	//The content of the Creature's stomach is the argument of eat().
	//Changes empty to false, since the Creature has eaten.
	public void eat(Thing aThing)
	{
		content=aThing;
		System.out.print(name + " " + "has just eaten" + " " + aThing + "\n");
		empty=false;
	}

	//Abstract Method for move(), changed in other Creature classes.
	public abstract void move();

	//If the stomach of the Creature is empty, prints the creature has has nothing to eat
	//If the stomach is not empty, prints the Creature has eaten the argument of eat()
	public void whatDidYouEat()
	{
		
		if(empty)
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "has had nothing to eat!\n");
		}
		else
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "has eaten" + " " + content + "\n");
		}
	}
}