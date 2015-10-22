	PROJECT  
	*************************************************************************
					GoEuroTest
	************************************************************************

COMPILING AND RUNNING

	The project uses Maven 3.1 for build and requires at least Java 7 
	To build the project you should run:
	1.- Go to root directory:
	
	\> /workspace/goeurotest
	
	2.- To run the project you have two options to choose:
	
	First option:
	
	> mvn clean spring-boot:run -Drun.arguments="cityName"
	
	Second option:
	
	> mvn clean install -DskipTests
	> mvn java -jar target/GoEuroTest.jar cityName
	
	** The file could be created in the next directory: /temp/locations.csv. Must have a directory with that name (/temp)
	
THE TESTS

	The project has two types of test: unit and integration
	
	Usage:
	> mvn install -DskipUTs : Skips Unit tests
	> mvn install -DskipITs : Skips Integration tests
	> mvn install -DskipTests : Skips both Unit and Integration Tests

	