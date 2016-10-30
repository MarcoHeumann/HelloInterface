package models;

import interfaces.INumbers;

/**
 * Simple Object implementation of the base number class.
 * 
 * @author Marco
 *
 */
public class IntModel implements INumbers
{
	// we save our Number here
	int intVal;

	/**
	 * Constructor
	 * 
	 * @param i
	 */
	public IntModel(int i)
	{
		intVal = i;
	}

	public int getIntVal()
	{
		return intVal;
	}
}
