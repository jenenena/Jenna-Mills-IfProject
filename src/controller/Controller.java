package controller;

//import section
import javax.swing.JOptionPane;
import model.Thing;

public class Controller
{
	private Thing myThing;
	
	/**
	 * Builds the instance of the controller
	 */
	public Controller()
	{
		//myThing = new Thing();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		askUser();
		//String myThingName = JOptionPane.showInputDialog(null, "What should we call my thing?");
		
		//JOptionPane.showMessageDialog(null, "This is my Thing. His name is: " + myThing.getName());
	}
	
	private void loopy()
	{
		boolean isDone = false;
		int count = 0;
				
		while(!isDone)
		{
			JOptionPane.showMessageDialog(null, "hit ok");
			//eventually change the loop variable
			
			count++;
			if (count >= 10)
			{
				isDone = true;
			}
		}
	}
	
	private void loopo()
	{
		boolean isFinished = false;
		int number = 5;
		
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "hey now you're an all star");
			
			number--;
			if (number < 1)
			{
				isFinished = true;
			}
		}

	
			for (int loop = 0; loop < 30; loop +=2)
			{
				JOptionPane.showMessageDialog(null, "The loop value is: " + loop);
			}	
		
		
	
	}

	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type an integer value :)");
		}
		return isValid;
		}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Please type a number with a decimal in it :)");
		}
		
		return isValid;
	}

	
	private void askUser()
	{
		String response = JOptionPane.showInputDialog(null, "What is the distance?");
		
		while (!validDouble(response))
		{
	
			response = JOptionPane.showInputDialog(null, "Please type in a valid number or I will be sad");
			
		}
		
	}




}





