package goeuro.de.app.exception;

/**
 * The Class LocationFinderException
 *
 */
public final class LocationFinderException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3486553952235007249L;

	/**
	 * 
	 */
	public LocationFinderException()
	{
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public LocationFinderException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public LocationFinderException(String message)
	{
		super(message);
	}

	/**
	 * @param cause
	 */
	public LocationFinderException(Throwable cause)
	{
		super(cause);
	}
}
