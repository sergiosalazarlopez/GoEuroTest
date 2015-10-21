/**
 * 
 */
package goeuro.de.app.api.service;

import java.util.List;

import goeuro.de.app.api.domain.Location;

/**
 * @author sergiosalazarlopez
 *
 */
public interface GoEuroRestService {

	/**
	 * Gets the location details by cityName
	 * 
	 * @param cityName
	 *            the cityName
	 * @return the location list
	 */
	List<Location> getLocationDetails(final String cityName);

}
