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

	public void setStrVal(String strVal)
	{
		this.strVal = strVal;
	}

	/**
	 * Forced method from the interface INumbers. Takes the base int and adds whatever number is
	 * hidden in the String of this object.
	 */
	@Override
	public String calculateThis(int base)
	{
		return "" + (base + Integer.parseInt(strVal));
	}
}
