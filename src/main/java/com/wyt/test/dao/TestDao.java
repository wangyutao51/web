/**
 * 
 */
package com.wyt.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.wyt.test.bean.UserInfo;

/**
 * @author WANG
 *
 */
@Component
public interface TestDao
{
	public String qruUserId(String username);
	
	public int insertUserInfo(UserInfo userInfo);
	
	public int updateUserinfo(@Param(value="userid") String userid,@Param(value="passwd") String passwd);
}
