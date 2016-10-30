package controller;

import java.util.ArrayList;
import java.util.List;

import interfaces.INumbers;
import models.BytModel;
import models.DblModel;
import models.FloModel;
import models.IntModel;
import models.StrModel;

/**
 * Controller for version 1 of this tutorial. No interface, no objects. Three subtasks.
 * 
 * @author Marco
 *
 */
public class TutorialController
{
	/**
	 * Variable Block, only the base and a list of types left. Yes, you can add differend types of
	 * values to the same list, as long as they all implement the same interface.
	 */
	int intBase = 10;
	List<INumbers> listNumbers = new ArrayList<INumbers>();

	/**
	 * Set values method is now more of an "addValues" method.
	 */
	public void setValues()
	{
		listNumbers.add(new IntModel(1));
		listNumbers.add(new DblModel(2.3));
		listNumbers.add(new StrModel("3"));
		listNumbers.add(new FloModel(4));
		listNumbers.add(new BytModel((byte) 5));
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		System.out.println("Five types of variables again. Interface and objects used the right way.");
		System.out.println();
		System.out.println("So, adding two more types, only added 2 more lines of code in the controller since we just added the two needed models.");
		System.out.println("As you can guess it does not matter how many actuall values we add in setValues(). Each value needs one line of code.");
		System.out.println("Can we do better? How about infinite values of our 5 types? Check the next branch for the baller approach.");
		System.out.println();
		for (INumbers val : listNumbers)
		{
			System.out.println("Hello Interface World Nr. " + val.calculateThis(intBase));
		}
	}
}
