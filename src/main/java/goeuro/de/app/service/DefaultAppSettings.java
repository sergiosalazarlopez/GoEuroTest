package goeuro.de.app.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class contains default settings
 * 
 * @author sergiosalazarlopez
 *
 */
@Component
@ConfigurationProperties(locations = { "classpath:/application.yml" }, prefix = "application")
public class DefaultAppSettings {

	/**
	 * The outputFileName
	 */
	private String outputFileName;

	/**
	 * The outputFilePath
	 */
	private String outputFilePath;

	/**
	 * The headers
	 */
	private String[] headers;

	/**
	 * @return the outputFileName
	 */
	public String getOutputFileName() {
		return outputFileName;
	}

	/**
	 * @param outputFileName
	 *            the outputFileName to set
	 */
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	/**
	 * @return the outputFilePath
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * @param outputFilePath
	 *            the outputFilePath to set
	 */
	public void setOutputFilePath(String outputFilePath) {
		this.outputFilePath = outputFilePath;
	}

	/**
	 * @return the headers
	 */
	public String[] getHeaders() {
		return headers;
	}

	/**
	 * @param headers
	 *            the headers to set
	 */
	public void setHeaders(String[] headers) {
		this.headers = headers;
	}
}
