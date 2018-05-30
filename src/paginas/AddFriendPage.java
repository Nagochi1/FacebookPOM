package paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddFriendPage {
	
	private WebDriver driver;
	
	public AddFriendPage(WebDriver driver2) {
		this.driver = driver2;
	}
		/*elements*/
		WebElement titlePersonLbl; // //span[contains(text(), 'Personas')]
	
		/*methods*/
		
		public void AddFriend(String nameFriend, String infoFriend) {
			String xpath = "//div[ contains(@class,'_2yer')]";
			WebElement correctContainer = null;
			
			List <WebElement> containerList = driver.findElements(By.xpath(xpath));
					
			for (int i = 0; i < containerList.size(); i++) {
				WebElement currentElement = containerList.get(i);
							
				if(currentElement.getText().contains(infoFriend)) {
					correctContainer = currentElement;
					break;
				}
			}
			
			
			if(correctContainer != null) {
				WebElement addFriendLink = correctContainer.findElement(By.xpath(".//button[@aria-label='Agregar a amigos']"));
				addFriendLink.click();

			}
		}
}
