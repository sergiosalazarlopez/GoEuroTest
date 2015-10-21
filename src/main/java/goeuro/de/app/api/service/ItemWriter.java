/**
 * 
 */
package goeuro.de.app.api.service;

import java.io.IOException;
import java.util.List;

/**
 * Basic interface for generic output operations.
 * 
 * @author sergiosalazarlopez
 *
 */
public interface ItemWriter<T> {

	/**
	 * Writes item values
	 * 
	 * @param items
	 *            items to be written
	 * @return
	 * @throws IOException
	 *             Exception if there are errors.
	 */
	boolean write(List<? extends T> items) throws IOException;
}