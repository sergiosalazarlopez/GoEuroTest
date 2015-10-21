/**
 * 
 */
package goeuro.de.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * This configuration class creates and configures RestTemplate bean
 *
 **/
@Configuration
@ComponentScan(basePackages = { "goeuro.de.app.service" })
@EnableConfigurationProperties
@EnableAutoConfiguration
public class AppConfig {

	/**
	 * @return the RetTemplate Object.
	 * 
	 */
	@Bean(name = "restTemplate")
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		// Add the Jackson Message converter
		messageConverters.add(new MappingJackson2HttpMessageConverter());
		restTemplate.setMessageConverters(messageConverters);
		return restTemplate;
	}

}