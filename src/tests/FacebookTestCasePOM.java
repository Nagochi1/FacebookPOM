package tests;

import org.junit.Test;

public class FacebookTestCasePOM extends BasePOM {
	
	@Test
	public void searchFriendTestCase()
	{
		login.logIn("luarball@hotmail.com", "Gonzalez");
		search.searchFriend("Jesus Omar Navarro");
	}

}
