package tests;

import org.junit.Test;

public class FacebookTestCasePOM extends BasePOM {
	
	@Test
	public void searchFriendTestCase()
	{
		login.logIn("luarball@hotmail.com", "Gonzalez");
		search.searchFriend("Carol Rojo");
	}
	
	@Test
	public void addFriendTestCase() {
		login.logIn("luarball@hotmail.com", "Gonzalez");
		search.searchFriend("Carol Rojo");
		friend.AddFriend("Carol Rojo", "Carolina Rojo");
				
	}

}
