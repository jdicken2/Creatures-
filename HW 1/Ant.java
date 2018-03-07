
public class Ant extends Creature 
{
    //Default Constructor (inherits from Creature)
	public Ant()
	{
		super();
	}
    
    //Nondefault Constructor (inherits from Creature)
    public Ant(String na)
    {
    	super(na);
    }

    //Ant move() function overrides move() in Creature, by stating the ant is crawling around
    public void move()
    {
   	   System.out.println(name + " " + this.getClass().getSimpleName() + " " + "is crawling around");	
    }

    //No need to override eat() and whatDidYouEat() methods. 
}