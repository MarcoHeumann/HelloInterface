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

	/**
	 * Forced method from the interface INumbers. Takes the base int and adds whatever int number is
	 * in this object.
	 */
	@Override
	public String calculateThis(int base)
	{
		return "shiny int " + (base + intVal);
	}
}
