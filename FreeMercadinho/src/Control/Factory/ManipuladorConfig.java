package Control.Factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ManipuladorConfig {
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"./Config/config.properties");
		props.load(file);
		return props;
	}
}
