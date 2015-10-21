
package goeuro.de.app.api.util;

import org.apache.commons.lang.Validate;

/**
 * The Class Asserts.
 */
public final class Asserts {

	private Asserts() {
		// Do not use
	}

	/**
	 * notEmpty
	 * 
	 * @param value
	 *            Time into a String
	 * @param format
	 *            format
	 * @param message
	 *            message
	 */
	public static void notEmpty(String[] args, String message) {
		Validate.notEmpty(args, message);
	}

}
