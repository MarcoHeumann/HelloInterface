package main;

import controller.TutorialController;

/**
 * The task for this tutorial is to take the int value of 10 and add another value to it. Then print
 * "Hello Interface World Nr xx" into the console. The catch: We have three different types of
 * values for adding in this step.
 * 
 * This part will add some additional output to each class, so we can doublecheck the output. We
 * also add two more models for added types.
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
