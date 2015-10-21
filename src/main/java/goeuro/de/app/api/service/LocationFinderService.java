/**
 * 
 */
package goeuro.de.app.api.service;

/**
 * the LocationFinderService
 * 
 * @author sergiosalazarlopez
 *
 */
public interface LocationFinderService {

	/**
	 * Finds the locations by City name
	 * 
	 * @param cityName
	 *            the city name to be found
	 * @return Return a True/False value. This depends on if there are errors
	 */
	boolean findbyCityName(final String cityName);

}
