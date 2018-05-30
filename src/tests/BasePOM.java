package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import paginas.AddFriendPage;
import paginas.LoginPage;
import paginas.SearchPage;

public class BasePOM { 
	
	private static WebDriver driver;
	protected LoginPage login;
	protected SearchPage search;
	protected AddFriendPage friend;
	
	private static final String driverName = "webdriver.chrome.driver";
	private static final String driverPath = "C:\\test_automation\\drivers\\chromedriver.exe";
	
	@Before
	public void setup() {
		System.setProperty(driverName, driverPath);
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        driver = new ChromeDriver(ops);
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("http://www.facebook.com"); 
		login = new LoginPage(driver);
		search = new SearchPage(driver);
		friend = new AddFriendPage(driver);
			
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	

}
