
public class Tiger extends Creature
{
	//Default Constructor (inherits from Creature)
	public Tiger()
	{
		super();
	}

	//Nondefault Constructor (inherits from Creature)
	public Tiger(String na)
	{
		super(na);
	}
	
	//Tiger move() overrides move() in Creature, by stating the Tiger pounced
	public void move()
	{
		System.out.print(name + " " + this.getClass().getSimpleName() + " " + "has just pounced\n");
	}

	//No need to override eat() and whatDidYouEat(). 

}