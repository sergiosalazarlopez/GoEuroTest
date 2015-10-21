/**
 * 
 */
package goeuro.de.app.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import goeuro.de.app.api.service.GoEuroRestService;
import goeuro.de.app.api.service.LocationFinderService;
import goeuro.de.app.exception.LocationFinderException;

/**
 * The LocationFinderServiceImpl class
 * 
 * @author sergiosalazarlopez
 *
 */
@Service
public class LocationFinderServiceImpl implements LocationFinderService {

	/**
	 * The csvFileWriter
	 */
	@Autowired
	private CSVFileWriter csvFileWriter;

	/**
	 * The goEuroRestService
	 */
	@Autowired
	private GoEuroRestService goEuroRestService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * goeuro.de.app.api.service.LocationFinderService#findbyCityName(java.lang.
	 * String)
	 */
	@Override
	public boolean findbyCityName(final String cityName) {
		boolean result = Boolean.FALSE;
		try {
			result = csvFileWriter.write(goEuroRestService.getLocationDetails(cityName));
		} catch (IOException | ResourceAccessException e) {
			throw new LocationFinderException(e);
		}
		return result;
	}

}
