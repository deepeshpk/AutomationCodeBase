package page;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {

	public static WebDriver driver;
	public static Properties prop;

	public BasePage() throws IOException {

		try {

			prop = new Properties();
			FileInputStream ip = new FileInputStream("config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void initilization() {
		String browsername = prop.getProperty("browser");
		if ((browsername).equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/deepeshpoonthorakandy/Downloads/chromedriver2");
			driver = new ChromeDriver();

		} else if ((browsername).contentEquals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/usr/local/Cellar/geckodriver/0.26.0/bin/geckodriver");
			driver = new FirefoxDriver();

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println(" Bye welcome"+ prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));

	}

	public WebDriver getDriver() {
		
		return driver;
	}

}
