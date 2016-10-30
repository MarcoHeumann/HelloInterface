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

	public void setDblVal(double dblVal)
	{
		this.dblVal = dblVal;
	}

	/**
	 * Forced method from the interface INumbers. Takes the base int and adds whatever dbl number is
	 * in this object.
	 */
	@Override
	public String calculateThis(int base)
	{
		return "" + (base + dblVal);
	}
}
