package util;

import models.BytModel;
import models.DblModel;
import models.FloModel;
import models.IntModel;
import models.StrModel;

/**
 * Basic approach to check for a supported type and act accordingly.
 * 
 * @author Marco
 *
 */
public class TypeChecker
{
	public FloModel getTheType(float f)
	{
		return new FloModel(f);
	}

	public BytModel getTheType(byte b)
	{
		return new BytModel(b);
	}

	public DblModel getTheType(double d)
	{
		return new DblModel(d);
	}

	public IntModel getTheType(int i)
	{
		return new IntModel(i);
	}

	public StrModel getTheType(String s)
	{
		return new StrModel(s);
	}
}
