package goeuro.de.app.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This Class contains the location domain values
 * 
 * @author sergiosalazarlopez
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -499062499622517576L;
	/**
	 * the _id
	 */
	private Long _id;
	/**
	 * the key
	 */
	private String key;
	/**
	 * the name
	 */
	private String name;
	/**
	 * the fullName
	 */
	private String fullName;
	/**
	 * the iataAirportCode
	 */
	@JsonProperty("iata_airport_code")
	private String iataAirportCode;
	/**
	 * the locationType
	 */
	@JsonProperty("type")
	private LocationType locationType;
	/**
	 * the country
	 */
	private String country;
	/**
	 * the geoPosition
	 */
	@JsonProperty("geo_position")
	private GeoPosition geoPosition;
	/**
	 * the locationId
	 */
	private Long locationId;
	/**
	 * the inEurope
	 */
	private boolean inEurope;
	/**
	 * the countryCode
	 */
	private String countryCode;
	/**
	 * the coreCountry
	 */
	private boolean coreCountry;
	/**
	 * the distance
	 */
	private String distance;

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the inEurope
	 */
	public boolean isInEurope() {
		return inEurope;
	}

	/**
	 * @param inEurope
	 *            the inEurope to set
	 */
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the coreCountry
	 */
	public boolean isCoreCountry() {
		return coreCountry;
	}

	/**
	 * @param coreCountry
	 *            the coreCountry to set
	 */
	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	/**
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * @return the iataAirportCode
	 */
	public String getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 * @param iataAirportCode
	 *            the iataAirportCode to set
	 */
	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	/**
	 * @return the geoPosition
	 */
	public GeoPosition getGeoPosition() {
		return geoPosition;
	}

	/**
	 * @param geoPosition
	 *            the geoPosition to set
	 */
	public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}

	/**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the locationType
	 */
	public LocationType getLocationType() {
		return locationType;
	}

	/**
	 * @param locationType
	 *            the locationType to set
	 */
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

}
