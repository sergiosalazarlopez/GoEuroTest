/**
 * 
 */
package goeuro.de.app.service;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.core.io.Resource;

import goeuro.de.app.api.domain.Location;

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ CSVFileWriterTest.class })
public class CSVFileWriterTest {

	@Mock
	private CSVFileWriter csvFileWriter;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.CSVFileWriter#getOutputFile()}.
	 */
	@Test
	public void testGetOutputFile() {
		Resource mockResource = Mockito.mock(Resource.class);
		PowerMockito.when(csvFileWriter.getOutputFile()).thenReturn(mockResource);
		Resource resource = csvFileWriter.getOutputFile();
		Assert.assertEquals(resource, mockResource);
	}

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.CSVFileWriter#write(java.util.List)}.
	 * 
	 * @throws IOException
	 */

	@Test
	@SuppressWarnings("unchecked")
	public void testWrite() throws IOException {
		List<Location> mockList = Mockito.mock(List.class);
		PowerMockito.when(csvFileWriter.write(mockList)).thenReturn(new Boolean(true));
		boolean rasult = csvFileWriter.write(mockList);
		Assert.assertEquals(rasult, true);
	}

}
