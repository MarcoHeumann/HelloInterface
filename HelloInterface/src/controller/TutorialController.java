package controller;

/**
 * Controller for version 1 of this tutorial. No interface, no objects. Three subtasks.
 * 
 * @author Marco
 *
 */
public class TutorialController
{
	/**
	 * Variable Block
	 */
	int intBase = 10;
	int intVal;
	double dblVal;
	String strVal;

	/**
	 * Optional variables. Could be done inline as well.
	 */
	String strValueOne;
	String strValueTwo;
	String strValueThree;

	/**
	 * Constructor
	 */
	public TutorialController()
	{
	}

	/**
	 * Set values method
	 */
	public void setValues()
	{
		intVal = 1;
		dblVal = 2.3;
		strVal = "3";
	}

	/**
	 * format values method
	 */
	public void formatValues()
	{
		// first format
		strValueOne = "" + (intBase + intVal);

		// second format, would look dirty without compilers doing the work behind the scene
		strValueTwo = "" + (intBase + dblVal);

		// third format. Can not cast everything, so this actually needs converting.
		strValueThree = "" + (intBase + Integer.parseInt(strVal));
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		System.out.println("Three types of variables. No interface used, no objects used.");
		System.out.println("12 Lines of code needed for 3 variables.");
		System.out.println();
		System.out.println("Hello Interface World Nr. " + strValueOne);
		System.out.println("Hello Interface World Nr. " + strValueTwo);
		System.out.println("Hello Interface World Nr. " + strValueThree);
	}
}
