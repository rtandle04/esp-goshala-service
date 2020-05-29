package com.goshala.dto;

import java.util.List;

public class UserResponseListDTO {
	
	private List<User> userList;

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
