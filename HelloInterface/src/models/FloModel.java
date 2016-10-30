package models;

import interfaces.INumbers;

/**
 * Simple Object implementation of the base number class.
 * 
 * @author Marco
 *
 */
public class FloModel implements INumbers
{
	// we save our Number here
	float floVal;

	/**
	 * Constructor
	 * 
	 * @param d
	 */
	public FloModel(float f)
	{
		floVal = f;
	}

	/**
	 * Forced method from the interface INumbers. Takes the base int and adds whatever dbl number is
	 * in this object.
	 */
	@Override
	public String calculateThis(int base)
	{
		return "shiny float " + (base + floVal);
	}
}
