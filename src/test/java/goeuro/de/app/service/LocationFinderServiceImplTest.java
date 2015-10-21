/**
 * 
 */
package goeuro.de.app.service;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import goeuro.de.app.api.service.LocationFinderService;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ LocationFinderServiceImplTest.class })
public class LocationFinderServiceImplTest {

	@Mock
	private LocationFinderService locationFinderService;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.LocationFinderServiceImpl#findbyCityName(java.lang.String)}
	 * .
	 */
	@Test
	public void testFindbyCityName() {
		PowerMockito.when(this.locationFinderService.findbyCityName(Matchers.anyString()))
				.thenReturn(new Boolean(true));
		boolean resut = locationFinderService.findbyCityName("");
		Assert.assertEquals(true, resut);
	}

	@SuppressWarnings("unchecked")
	@Test(expected = IOException.class)
	public void testFindbyCityNameException() {
		PowerMockito.when(this.locationFinderService.findbyCityName(Matchers.anyString())).thenThrow(IOException.class);
		locationFinderService.findbyCityName("");
	}

}
