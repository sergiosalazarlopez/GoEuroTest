package goeuro.de.app.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.core.io.Resource;

import goeuro.de.app.api.domain.Location;
import goeuro.de.app.api.service.ItemWriter;

/**
 * 
 * The abstract Class
 *
 * @author sergiosalazarlopez
 *
 */
public abstract class AbstractFileItemWriter implements ItemWriter<Location> {

	/**
	 * Gets the output file
	 * 
	 * @return
	 */
	public abstract Resource getOutputFile();

	/**
	 * Gets the headers to be written
	 * 
	 * @return
	 */
	public abstract String[] getHeaders();

	/**
	 * The csvPrinter
	 */
	private CSVPrinter csvPrinter;

	/**
	 * Creates a CSVPrinter instance
	 * 
	 * @throws Exception
	 *             if there are errors.
	 */
	void createFile() throws IOException {
		this.csvPrinter = new CSVPrinter(new PrintWriter(getOutputFile().getFile()), addHeaders());
	}

	/**
	 * creates CSVFormat instance
	 * 
	 * @return
	 */
	private CSVFormat addHeaders() {
		CSVFormat format = CSVFormat.DEFAULT;
		if (getHeaders() != null) {
			format = format.withHeader(getHeaders());
		} else {
			format = format.withHeader();
		}
		return format;
	}

	/**
	 * Adds records to CSVPrinter
	 * 
	 * @param resultData
	 * 
	 * @throws IOException
	 *             Exception if there are errors.
	 */
	void addRecord(List<String> resultData) throws IOException {
		this.csvPrinter.printRecord(resultData);
	}

	/**
	 * Closes CSVPrinter instance
	 * 
	 * @throws IOException
	 *             Exception if there are errors.
	 */
	void closeFile() throws IOException {
		if (csvPrinter != null) {
			csvPrinter.flush();
			csvPrinter.close();
			csvPrinter = null;
		}
	}
}
