package models;

import interfaces.INumbers;

/**
 * Simple Object implementation of the base number class.
 * 
 * @author Marco
 *
 */
public class BytModel implements INumbers
{
	// we save our Number here
	byte bytVal;

	/**
	 * Constructor
	 * 
	 * @param d
	 */
	public BytModel(byte b)
	{
		bytVal = b;
	}

	/**
	 * Forced method from the interface INumbers. Takes the base int and adds whatever dbl number is
	 * in this object.
	 */
	@Override
	public String calculateThis(int base)
	{
		return "shiny byte " + (base + bytVal);
	}
}
