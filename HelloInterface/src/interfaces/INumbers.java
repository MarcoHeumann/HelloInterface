package interfaces;

/**
 * Just an empty interface!
 * 
 * @author Marco
 *
 */
public interface INumbers
{
	/**
	 * This method will force every class that implements INumbers to have the same method. Every
	 * class will have to have calculateThis that takes an int value and returns a string.
	 * 
	 * @param base
	 * @return
	 */
	public String calculateThis(int base);
}
