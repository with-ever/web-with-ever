package kr.whenever.domain;

import kr.whenever.domain.common.PageSearch;

public class UserSearch extends PageSearch<User>{
	
	public UserSearch() {
		//
	}
	
	private String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
