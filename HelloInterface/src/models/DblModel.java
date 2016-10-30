package models;

import interfaces.INumbers;

/**
 * Simple Object implementation of the base number class.
 * 
 * @author Marco
 *
 */
public class DblModel implements INumbers
{
	// we save our Number here
	double dblVal;

	/**
	 * Constructor
	 * 
	 * @param d
	 */
	public DblModel(double d)
	{
		dblVal = d;
	}

	public double getDblVal()
	{
		return dblVal;
	}
}
