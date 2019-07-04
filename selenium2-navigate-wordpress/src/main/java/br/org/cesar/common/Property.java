package br.org.cesar.common;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
/**
* @author jcan
* Define o caminho do driver dos diferentes browsers
* Acessa as configura��es definidas no config.properties e retorna a informa��o 
*/
public abstract class Property {

	public static String CHROME_DRIVE_PATH;
	public static String IE64_DRIVE_PATH;
	public static String FIREFOX_DRIVE_PATH;
	public static String GECKO_DRIVE_PATH;
	public static final String BROWSER_NAME;
	public static final String SITE_ADDRESS;
	
	private static final String PROPERTIES_FILE = "br/org/cesar/config.properties";
	
	static{
		CHROME_DRIVE_PATH = new File("").getAbsolutePath() + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver";
		IE64_DRIVE_PATH = new File("").getAbsolutePath() + "\\src\\main\\resources\\IEDriverServer.exe";
		GECKO_DRIVE_PATH = new File("").getAbsolutePath() + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver";
		FIREFOX_DRIVE_PATH = new File("").getAbsolutePath() + "%PROGRAMFILES%\\Mozilla Firefox\\firefox.exe";
		BROWSER_NAME = get("browser.name");
		SITE_ADDRESS = get("site.address");
	}
	
	/**
	 * Metodo para pegar o valor de alguma propriedade no arquivo de configuracao do Selenium
	 * O caminho e o nome do arquivo pode ser trocados
	 */
	private static String get(String name) {
		Properties properties = new Properties();
		String value = null;
		try {
			properties.load(Property.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE));
		    value = properties.getProperty(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
