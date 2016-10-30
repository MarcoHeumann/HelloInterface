package main;

import controller.TutorialController;

/**
 * The task for this tutorial is to take the int value of 10 and add another value to it. Then print
 * "Hello Interface World Nr xx" into the console. The catch: We have three different types of
 * values for adding in this step.
 * 
 * This part will add two more types of variables for a total of five.
 * 
 * @author Marco
 *
 */
public class Main
{
	public static void main(String[] args)
	{
		TutorialController tutCon = new TutorialController();
		tutCon.setValues();
		tutCon.formatValues();
		tutCon.printValues();
	}
}
