package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	private WebDriver driver;
	
	/*elements*/
	WebElement searchFriendTxt;
	WebElement searchBtn;
	
	
	/*methods*/

	public SearchPage(WebDriver driver3) {
		this.driver = driver3;
	}


	public void searchFriend(String name) {
		searchFriendTxt = driver.findElement(By.name("q"));
		searchFriendTxt.sendKeys(name);
		searchBtn = driver.findElement(By.xpath("//button[@data-testid='facebar_search_button']"));
				
	}
	
	
	
	

}
