package tw.com.msig.dao;

import java.util.ArrayList;
import java.util.List;

import tw.com.msig.entity.PolicyEntity;

public class PolicyDao {

	private String url;
	private String username;
	private String password;

	public PolicyDao(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		System.out.println("constructor finish");
	}

	public List<PolicyEntity> findAll() {
		System.out.println("connect to " + url + " [" + username + "/" + password + "]");
		return new ArrayList<>();
	}
	
	public void setUp() {
		System.out.println("initial finish!");
	}

	public void destroy() {
		System.out.println("bye");
	}
	
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

}
