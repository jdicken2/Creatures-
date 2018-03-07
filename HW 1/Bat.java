public class Bat extends Creature implements Flyer
{
	//Default Constructor (inherits from Creature)
	public Bat()
	{
       super();
	}

	//Nondefault Constructor (inherits from Creature)
	public Bat(String na)
	{
	   super(na);	
	}
	
	//Overrides eat()
	//Bat will not eat Things that are not Creatures.
	//Changes empty to false if it did eat the creature, otherwise, empty remains false
	public void eat(Thing aThing)
	{
		if(!(aThing  instanceof Creature))
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "won't eat" + " " + aThing + " " + "because it is not a Creature\n");
			empty=true;
		}
		else
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "ate" + " " + aThing + "\n");
			content=aThing;
			empty=false;
		}
	}

	//Bats move by flying
	//Bats fly by swopping through the dark
	//Move() overrides move() in Creature by calling fly() in Bat
	public void move()
	{
		fly();
	}

	public void fly()
	{
		System.out.print(name + " " + this.getClass().getSimpleName() + " " + "is swooping through the dark\n");
	}
	
}