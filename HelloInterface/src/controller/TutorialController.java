package controller;

import java.util.ArrayList;
import java.util.List;

import interfaces.INumbers;
import models.DblModel;
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
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		System.out.println("Three types of variables again. Interface and objects used the right way.");
		System.out.println();
		System.out.println("Thanks for looping over a list<interface> we reduced the code a lot. It is also very modular now, check next branch on how to add more types of numbers.");
		System.out.println();
		for (INumbers val : listNumbers)
		{
			System.out.println("Hello Interface World Nr. " + val.calculateThis(intBase));
		}
	}
}
