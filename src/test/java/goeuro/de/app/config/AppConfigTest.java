/**
 * 
 */
package goeuro.de.app.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ AppConfigTest.class })
public class AppConfigTest {

	@Mock
	private AppConfig appConfig;

	@Mock
	private RestTemplate mockRestTemplate;

	/**
	 * Test method for {@link goeuro.de.app.config.AppConfig#getRestTemplate()}.
	 */
	@Test
	public void testGetRestTemplate() {
		PowerMockito.when(appConfig.getRestTemplate()).thenReturn(mockRestTemplate);
		RestTemplate restTemplate = appConfig.getRestTemplate();
		Mockito.verify(appConfig);
		Assert.assertEquals(restTemplate, this.mockRestTemplate);

	}

}
