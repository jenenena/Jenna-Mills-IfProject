package model;

public class Thing
{

	//data members go up here in the model, they're always private.
	//data members aren't like variables, they get a default value! Variables do not.
	//all numbers --> 0
	//booleans --> false
	//objects --> null
	private String name;
	private boolean isSad;
	private boolean flowers;
	
	
	

	/**
	 * Default constructor for when I don't yet know the information :)
	 * Here I initialize data members with "bad" values to be changed.
	 */
	public Thing()
	{
		this.name = "unnamed buddy";
		this.isSad = false;
		this.flowers = false;
	}
	
	
	
	
	/**
	 * better constructor when I know information for the Thing object.
	 * @param name is the name he'll be given
	 */

	//setters!
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setIsSad(boolean isSad)
	{
		this.isSad = isSad;
	}

	public void setFlowers(boolean flowers)
	{
		this.flowers = flowers;
	}
	
	
	

	
	//getters!
	public String getName()
	{
		return name;
	}
	
	public boolean getIsSad()
	{
		return isSad;
	}
	
	public boolean getFlowers()
	{
		return flowers;
	}
}
