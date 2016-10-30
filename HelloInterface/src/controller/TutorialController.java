package controller;

import models.DblModel;
import models.IntModel;
import models.StrModel;

/**
 * Controller for version 3 of this tutorial. Basic interface without functionality, basic objects.
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
	IntModel intVal;
	DblModel dblVal;
	StrModel strVal;

	/**
	 * Optional variables. Could be done inline as well.
	 */
	String strValueOne;
	String strValueTwo;
	String strValueThree;

	/**
	 * Set values method
	 */
	public void setValues()
	{
		intVal = new IntModel(1);
		dblVal = new DblModel(2.3);
		strVal = new StrModel("3");
	}

	/**
	 * format values method
	 */
	public void formatValues()
	{
		// first format
		strValueOne = "" + (intBase + intVal.getIntVal());

		// second format, would look dirty without compilers doing the work behind the scene
		strValueTwo = "" + (intBase + dblVal.getDblVal());

		// third format. Can not cast everything, so this actually needs converting.
		strValueThree = "" + (intBase + Integer.parseInt(strVal.getStrVal()));
	}

	/**
	 * print values method
	 */
	public void printValues()
	{
		System.out.println("Three types of variables again. Interface and objects used.");
		System.out.println();
		System.out.println("15 Lines of code needed for three variables again. Why is this a better approach again? Check next branch.");
		System.out.println();
		System.out.println("Hello Interface World Nr. " + strValueOne);
		System.out.println("Hello Interface World Nr. " + strValueTwo);
		System.out.println("Hello Interface World Nr. " + strValueThree);
	}
}
