/**
 * 
 */
package net.phptravels;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author choudhuryIqbal
 *
 */
public class BaseUtil {
	public void generateDriverInstances()
	{	
		
		ResourceBundle config=ResourceBundle.getBundle("config");
		config.getString("browser");
		
		WebDriver driver=new ChromeDriver();
	}

}
