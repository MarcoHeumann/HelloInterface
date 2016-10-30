package models;

import interfaces.INumbers;

/**
 * Simple Object implementation of the base number class.
 * 
 * @author Marco
 *
 */
public class StrModel implements INumbers
{
	// we save our Number here
	String strVal;

	/**
	 * Constructor
	 * 
	 * @param s
	 */
	public StrModel(String s)
	{
		strVal = s;
	}

	public String getStrVal()
	{
		return strVal;
	}
}
