public class Fly extends Creature implements Flyer
{
	//Default Constructor (inherits from Creature)
	public Fly()
	{
       super();
	}

	//Nondefault Constructor (inherits from Creature)
	public Fly(String na)
	{
	   super(na);	
	}

	//Overrides eat() in Creature
	//Fly eat() Function won't eat Creatures, and will only eat Things
	//Changes empty to false if it did eat a thing, otherwise, empty remains false
	public void eat(Thing aThing)
	{
		if(aThing instanceof Creature)
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "won't eat" + " " + aThing + " " +"because it is a Creature" + "\n");
			empty=true;
		}
		else
		{
			System.out.print(name + " " + this.getClass().getSimpleName() + " " + "has just eaten" + " " + aThing + "\n");
			content=aThing;
			empty=false;
		}
	}

	//Flies move by flying
	//Flies fly by buzzing around in flight
	//Move() overrides move() in Creature by calling fly() in Fly
	public void move()
	{
		fly();	
	}
	 public void fly()
	 {
	 	System.out.print(name + " " + this.getClass().getSimpleName() + " " + "is buzzing around in flight\n");
	 }

	 //No need to override whatDidYouEat();

}