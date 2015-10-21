package goeuro.de.app.api.domain;

/**
 * This Class contains the geo position {latitude,longitude} value.
 * 
 * @author sergiosalazarlopez
 *
 */
public class GeoPosition extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4498002022723738431L;

	/**
	 * The latitude of this location.
	 */
	public double lat;

	/**
	 * The longitude of this location.
	 */
	public double lng;

	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @param lat
	 *            the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}

	/**
	 * @return the lng
	 */
	public double getLng() {
		return lng;
	}

	/**
	 * @param lng
	 *            the lng to set
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}

}
