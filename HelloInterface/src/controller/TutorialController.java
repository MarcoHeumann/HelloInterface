package controller;

import java.util.ArrayList;
import java.util.List;

import interfaces.INumbers;

/**
 * Controller for version 1 of this tutorial. No interface, no objects. Three subtasks.
 * 
 * @author Marco
 *
 */
public class TutorialController
{
	/**
	 * Variable Block, only the base and a list of types left. Yes, you can add different types of
	 * values to the same list, as long as they all implement the same interface.
	 */
	int intBase = 10;
	List<INumbers> listNumbers = new ArrayList<INumbers>();

	/**
	 * Set values method is now more of an "addValues" method.
	 */
	public void setValues(INumbers myNum)
	{
		listNumbers.add(myNum);
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		for (INumbers val : listNumbers)
		{
			System.out.println("Hello Interface World Nr. " + val.calculateThis(intBase));
		}
		System.out.println();
		System.out.println("Five types of variables again, added 10 times each. Interface and objects used the right way.");
		System.out.println();
		System.out.println("The numbers are now added outside the controller and checked for type in a util class.");
		System.out.println("It is easily possible to add as many numbers of the five supported types as you want. Zero additional code needed in the controller!");
		System.out.println("To add a new type of number you simply add the model and the coresponding method in the TypeChecker.");
	}
}
