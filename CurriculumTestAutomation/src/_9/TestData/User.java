package _9.TestData;

import _10.Utils.Reader;

public class User {
	private String username;
	private String password;
	
	public User(String fileName) {
		this.username = Reader.json(fileName).get("username").toString();
		this.password = Reader.json(fileName).get("password").toString();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
