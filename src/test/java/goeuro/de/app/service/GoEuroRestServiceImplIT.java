package goeuro.de.app.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import goeuro.de.app.api.domain.Location;
import goeuro.de.app.api.service.GoEuroRestService;
import goeuro.de.app.config.AppConfig;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppConfig.class)
@IntegrationTest
@ActiveProfiles("test")
public class GoEuroRestServiceImplIT {

	@Autowired
	private GoEuroRestService goEuroRestService;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.GoEuroRestServiceImpl#getLocationDetails(java.lang.String)}
	 * .
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetLocationDetails() throws Exception {
		List<Location> locations = goEuroRestService.getLocationDetails("Berlin");
		Assert.assertNotNull(locations);
		Assert.assertNotNull(locations.get(0).getName());
	}

}
