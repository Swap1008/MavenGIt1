package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig() {
		File file=new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getBaseUrl() {
		String url=prop.getProperty("baseUrl");
		return url;
	}
	
	public String getChromePath() {
		String path=prop.getProperty("chromepath");
		return path;
	}
}
