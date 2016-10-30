package main;

import controller.TutorialController;

/**
 * The task for this tutorial is to take the int value of 10 and add another value to it. Then print
 * "Hello Interface World Nr xx" into the console. The catch: We have three different types of
 * values for adding in this step.
 * 
 * This part will add a method to the interface and implement it in each class. The goal is to be
 * able to use a loop for formatting and printing in the TutorialController.
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
		tutCon.printValues();
	}
}
