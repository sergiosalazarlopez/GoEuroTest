/**
 * 
 */
package goeuro.de.app.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import goeuro.de.app.api.service.LocationFinderService;
import goeuro.de.app.config.AppConfig;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppConfig.class)
@IntegrationTest
@ActiveProfiles("test")
public class LocationFinderServiceImplIT {

	@Autowired
	private LocationFinderService locationFinderService;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.LocationFinderServiceImpl#findbyCityName(java.lang.String)}
	 * .
	 */
	@Test
	public void testFindbyCityName() {
		boolean result = locationFinderService.findbyCityName("Berlin");
		Assert.assertEquals(result, true);
	}

}
