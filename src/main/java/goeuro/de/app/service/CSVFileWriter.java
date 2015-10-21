/**
 * 
 */
package goeuro.de.app.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import goeuro.de.app.api.domain.Location;

/**
 * The CSVFileWriter class
 * 
 * @author sergiosalazarlopez
 *
 */
@Component
public class CSVFileWriter extends AbstractFileItemWriter {

	/**
	 * The logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CSVFileWriter.class);

	/**
	 * Default Application settings
	 */
	@Autowired
	private DefaultAppSettings defaultAppSetting;

	@Override
	public Resource getOutputFile() {
		return new FileSystemResource(defaultAppSetting.getOutputFilePath() + defaultAppSetting.getOutputFileName());
	}

	@Override
	public String[] getHeaders() {
		return defaultAppSetting.getHeaders();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see goeuro.de.app.api.service.ItemWriter#write(java.util.List)
	 */
	@Override
	public boolean write(List<? extends Location> locations) throws IOException {
		boolean result = Boolean.FALSE;
		try {
			createFile();
			List<String> resultData = null;
			for (final Location location : locations) {
				resultData = new ArrayList<String>();
				resultData.add(String.valueOf(location.get_id()));
				resultData.add(location.getName());
				resultData.add(location.getLocationType().name());
				resultData.add(
						String.valueOf(location.getGeoPosition() == null ? 0 : location.getGeoPosition().getLat()));
				resultData.add(
						String.valueOf(location.getGeoPosition() == null ? 0 : location.getGeoPosition().getLng()));
				addRecord(resultData);
			}
			result = Boolean.TRUE;
		} catch (IOException e) {
			LOGGER.error("Got an error while processing theº data: ", e);
			throw new IOException(e);
		} finally {
			try {
				closeFile();
			} catch (IOException e) {
				LOGGER.error("Unable to close CSVPrinter: ", e);
			}
		}
		return result;
	}

}
