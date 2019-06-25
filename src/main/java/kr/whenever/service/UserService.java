package kr.whenever.service;

import java.util.List;
import java.util.Map;

import kr.whenever.domain.User;
import kr.whenever.domain.UserSearch;

public interface UserService {
	
	void registerUser(User user);
	
	void modifyUser(User user);
	
	void removeUser(Long pid);
	
	User findUser(Long pid);

	List<User> findUserList();
	
	Map<String, String> identifiedUser(String uid, String password);
	
	User findUserByEmail(String uid);
	
	UserSearch findUserListBySearch(UserSearch search);

}
