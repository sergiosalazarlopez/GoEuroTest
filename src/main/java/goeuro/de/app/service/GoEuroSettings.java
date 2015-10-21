/**
 * 
 */
package goeuro.de.app.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class contains goEuro settings
 *
 * @author sergiosalazarlopez
 *
 */
@Component
@ConfigurationProperties(locations = { "classpath:/goeuro.yml" }, prefix = "goeuro")
public class GoEuroSettings {

	private String endpoint;

	/**
	 * @return the endpoint
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
