package model;

public class Thing
{

	//data members go up here in the model, they're always private
	private String name;
	private boolean isSad;
	private int flowers;
	
	public Thing(String name, boolean isSad, int flowers)
	{
		this.name = name;
		this.isSad = isSad;
		this.flowers = flowers;
	}

	public String getName()
	{
		return name;
	}
	
	public boolean getIsSad()
	{
		return isSad;
	}
	
	public int getFlowers()
	{
		return flowers;
	}
}
