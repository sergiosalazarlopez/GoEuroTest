/**
 * 
 */
package goeuro.de.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import goeuro.de.app.api.service.LocationFinderService;
import goeuro.de.app.api.util.Asserts;

/**
 * Application Class starts the application.
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private LocationFinderService locationFinderService;

	public static void main(String[] args) {
		Asserts.notEmpty(args, "The args should not be empty");
		// Launch the application
		new SpringApplicationBuilder(Application.class).web(false).run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		locationFinderService.findbyCityName(args[0]);

	}
}
