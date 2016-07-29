/**
 * 
 */
package com.wyt.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyt.test.dao.TestDao;
import com.wyt.test.service.ITestService;

/**
 * @author WANG
 *
 */
@Service("testServiceImpl")
public class TestServiceImpl implements ITestService
{
	
	@Autowired
	private TestDao testDao;
	
	public String queryUserIdByName(String userName)
	{
		return testDao.qruUserId(userName);
	}

	public TestDao getTestDao()
	{
		return testDao;
	}

	public void setTestDao(TestDao testDao)
	{
		this.testDao = testDao;
	}
	
	
}
