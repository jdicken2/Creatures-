
public class Thing extends Object
{
	//Name is the name of the Thing
	public String name;

	//Default Constructor
	public Thing()
	{
		name=" ";
		
	}

	//Non Default Constructor
	public Thing(String na)
	{
		name=na;
	}

	//Accessor Method for name
	public String getName()
	{
		return name;
	}

	//Mutator Method for name
	public String setName(String nam)
	{
		name=nam;
		return name;
	}

	//Returns just the name of the Thing if it is only a Thing
	//Otherwise returns the name and class name (using the convention in the HW Description)
	//Also prints one line about each Thing
	public String toString()
	{
		String className=getClass().getSimpleName();
		String firstAndLastName=name + " " + className;
		if(className.equals("Thing"))
		{
			return name;
		}
		else
		{
			return firstAndLastName;
		}
	}	
}
