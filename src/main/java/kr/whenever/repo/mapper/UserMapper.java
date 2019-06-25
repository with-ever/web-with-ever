package kr.whenever.repo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.whenever.domain.User;
import kr.whenever.domain.UserSearch;

public interface UserMapper {

	void insertUser(User user);

	void updateUser(User user);
	
	void deleteUser(@Param("pid") Long pid);
	
	User selectUser(@Param("pid") Long pid);

	List<User> selectUserList();
	
	User selectUserByEmail(@Param("uid") String uid);

	List<User> selectUserListBySearch(UserSearch search);

	int selectUserListTotalCount(UserSearch search);

}
