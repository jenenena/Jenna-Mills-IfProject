package controller;

//import section
import javax.swing.JOptionPane;
import model.Thing;

public class Controller
{
	private Thing myThing;
	
	public Controller()
	{
		myThing = new Thing();
	}
	
	public void start()
	{
		String myThingName = JOptionPane.showInputDialog(null, "What should we call my thing?");
		
		JOptionPane.showMessageDialog(null, "This is my Thing. His name is: " + myThing.getName());
	}
}
