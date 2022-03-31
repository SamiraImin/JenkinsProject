 package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	private static Properties userdataFile;

	static {

		try {
			String filePath = "src/test/resources/dataFolder/userdata.properties";

			// This class opens a path to the file
			FileInputStream input = new FileInputStream(filePath);

			userdataFile = new Properties();
			userdataFile.load(input);

			input.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static String getProperty(String KeyName) {
		
	return userdataFile.getProperty(KeyName);
	}
	
	
	
	
	
}
