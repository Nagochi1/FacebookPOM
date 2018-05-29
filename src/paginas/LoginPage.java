package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	
	/*elements*/
	WebElement fbLogoImg;
	WebElement emailTxt;
	WebElement passwordTxt;
	WebElement loginBtn;
		
	
	/*methods*/

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
	}


	public void logIn(String user,String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Iniciar sesión']")).click();
		
	}
}
