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
		forLoopert();
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

	private void forLoopert()
	{
		
		for (int count = 1; count <= 4; count++)
		{
			JOptionPane.showMessageDialog(null, "This is our thing #" + count);
			askUser();
		}	
	}
	
	
	private void askUser()
	{
		Thing userThing = new Thing();
		
		String aResponse = JOptionPane.showInputDialog(null, "What shall we name our thing?");
		while (aResponse == null || aResponse.equals(""))
		{
			
			String bResponse = JOptionPane.showInputDialog(null, "Please name our thing, pretty please?");
			aResponse = bResponse;
		}
		
		userThing.setName(aResponse);
		

		String response = JOptionPane.showInputDialog(null, "How many flowers should we give " + aResponse + "?");
		while (response == null || !validDouble(response))
		{
	
			response = JOptionPane.showInputDialog(null, "Please type in a number of flowers or " + aResponse + " will be sad...");
			
		}
		if (validDouble(response))
		{
			userThing.setFlowers(Double.parseDouble(response));
			JOptionPane.showMessageDialog(null, "You gave " + aResponse + " " + response + " flowers!");
		}
		JOptionPane.showMessageDialog(null, userThing);
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

	
	
		





}





