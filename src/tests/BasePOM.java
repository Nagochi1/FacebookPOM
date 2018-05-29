package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import paginas.LoginPage;
import paginas.SearchPage;

public class BasePOM { 
	
	private static WebDriver driver;
	//private static final WebDriverWait driverWait;
	protected LoginPage login;
	protected SearchPage search;
	//AddFriendPage friend;
	
	private static final String DRIVER_NAME = "webdriver.chrome.driver";
	private static final String DRIVER_PATH = "C:\\testautomation\\libs\\drivers\\";
	
	@Before
	public void setup() {
		System.setProperty(DRIVER_NAME, DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		login = new LoginPage(driver);
		search = new SearchPage(driver);
		
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
	
	

}
