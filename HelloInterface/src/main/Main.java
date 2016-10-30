package main;

import controller.TutorialController;
import util.TypeChecker;

/**
 * The task for this tutorial is to take the int value of 10 and add another value to it. Then print
 * "Hello Interface World Nr xx" into the console. The catch: We have three different types of
 * values for adding in this step.
 * 
 * This part will add a type checker so we can add another loop. This time to add more values.
 * 
 * @author Marco
 *
 */
public class Main
{
	public static void main(String[] args)
	{
		TutorialController tutCon = new TutorialController();
		TypeChecker typeCheck = new TypeChecker();

		/**
		 * Important note: This "list" of numbers could be supplied from outside the program,
		 * multiplied by 1000 in size or more. It could also really just be a list and be looped
		 * over as well. For the sake of this tutorial we will just loop 10 times.
		 */
		int i = 1;
		double d = 2.3;
		String s = "3";
		float f = 4;
		byte b = 5;
		for (int j = 0; j < 10; j++)
		{
			tutCon.setValues(typeCheck.getTheType(i));
			tutCon.setValues(typeCheck.getTheType(d));
			tutCon.setValues(typeCheck.getTheType(s));
			tutCon.setValues(typeCheck.getTheType(f));
			tutCon.setValues(typeCheck.getTheType(b));
		}
		tutCon.printValues();
	}
}
