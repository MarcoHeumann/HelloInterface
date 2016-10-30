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
	float floVal;
	byte bytVal;

	/**
	 * Optional variables. Could be done inline as well.
	 */
	String strValueOne;
	String strValueTwo;
	String strValueThree;
	String strValueFour;
	String strValueFive;

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
		floVal = 4;
		bytVal = 5;
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

		// fourth format
		strValueFour = "" + (intBase + floVal);

		// Fifth format
		strValueFive = "" + (intBase + bytVal);
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		System.out.println("Hello Interface World Nr. " + strValueOne);
		System.out.println("Hello Interface World Nr. " + strValueTwo);
		System.out.println("Hello Interface World Nr. " + strValueThree);
		System.out.println("Hello Interface World Nr. " + strValueFour);
		System.out.println("Hello Interface World Nr. " + strValueFive);
		System.out.println();
		System.out.println("15 Lines of code needed for 5 variables.");
	}
}
