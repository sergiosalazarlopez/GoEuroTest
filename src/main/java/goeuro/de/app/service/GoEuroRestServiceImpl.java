package goeuro.de.app.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import goeuro.de.app.api.domain.Location;
import goeuro.de.app.api.service.GoEuroRestService;
import goeuro.de.app.exception.LocationFinderException;

/**
 * The GoEuroRestServiceImpl class
 * 
 * @author sergiosalazarlopez
 *
 */
@Service
public class GoEuroRestServiceImpl implements GoEuroRestService {

	private static final String CITY_NAME = "cityName";

	/**
	 * The RestTemplate
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * The goEuroSettings
	 */
	@Autowired
	private GoEuroSettings goEuroSettings;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * goeuro.de.app.api.service.GoEuroRestService#getLocationDetails(java.lang.
	 * String)
	 */
	public List<Location> getLocationDetails(final String cityName) {
		Map<String, String> params = new HashMap<String, String>();
		params.put(CITY_NAME, cityName);
		ResponseEntity<Location[]> responseEntity = this.restTemplate.getForEntity(this.goEuroSettings.getEndpoint(),
				Location[].class, params);
		List<Location> locations = Arrays.asList(responseEntity.getBody());
		if (!CollectionUtils.isNotEmpty(locations)) {
			throw new LocationFinderException(String.format("The cityName - %s - was not found", cityName));
		}
		return locations;
	}

}
