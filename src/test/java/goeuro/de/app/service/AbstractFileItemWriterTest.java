/**
 * 
 */
package goeuro.de.app.service;

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

/**
 * @author sergiosalazarlopez
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ AbstractFileItemWriterTest.class })
public class AbstractFileItemWriterTest {

	@Mock
	private AbstractFileItemWriter abstractFileItemWrite;

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.AbstractFileItemWriter#geOutputFile()}.
	 */
	@Test
	public void testGetOutputFile() {
		Resource mockResource = Mockito.mock(Resource.class);
		PowerMockito.when(abstractFileItemWrite.getOutputFile()).thenReturn(mockResource);
		Resource resource = abstractFileItemWrite.getOutputFile();
		Assert.assertEquals(resource, mockResource);
	}

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.AbstractFileItemWriter#createFile()}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCreateFile() throws Exception {
		PowerMockito.doNothing().when(abstractFileItemWrite, "createFile");
		abstractFileItemWrite.createFile();
	}

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.AbstractFileItemWriter#addRecord(java.util.List)}
	 * .
	 * 
	 * @throws Exception
	 */
	@Test
	@SuppressWarnings("unchecked")
	public void testAddRecord() throws Exception {
		List<String> mockList = Mockito.mock(List.class);
		PowerMockito.doNothing().when(abstractFileItemWrite, "addRecord", mockList);
		abstractFileItemWrite.addRecord(mockList);
	}

	/**
	 * Test method for
	 * {@link goeuro.de.app.service.AbstractFileItemWriter#closeFilºe()}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCloseFile() throws Exception {
		PowerMockito.doNothing().when(abstractFileItemWrite, "closeFile");
		abstractFileItemWrite.closeFile();
	}

}
