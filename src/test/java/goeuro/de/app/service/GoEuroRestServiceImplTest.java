/**
 * 
 */
package goeuro.de.app.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import goeuro.de.app.api.domain.Location;
import goeuro.de.app.api.service.GoEuroRestService;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ GoEuroRestServiceImplTest.class })
public class GoEuroRestServiceImplTest {

	@Mock
	private GoEuroRestService goEuroRestService;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.GoEuroRestServiceImpl#getLocationDetails(java.lang.String)}
	 * .
	 */

	@Test
	@SuppressWarnings("unchecked")
	public void testGetLocationDetails() {
		List<Location> mockList = Mockito.mock(List.class);
		PowerMockito.when(goEuroRestService.getLocationDetails(Matchers.anyString())).thenReturn(mockList);
		List<Location> locations = goEuroRestService.getLocationDetails("");
		Assert.assertEquals(locations, mockList);
	}

}
