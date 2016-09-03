package com.wyt.testunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyt.test.bean.UserInfo;
import com.wyt.test.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
//需要配置数据源的相关信息
@ContextConfiguration(locations={"file:src/main/resources/spring/applicationContext.xml"})
public class TestDaotest {
	
	@Autowired
	private TestDao testDao;
	
	//@Test
	public void testDao()
	{
		System.out.println("���Կ�ʼ");
		System.out.println(testDao.qruUserId("admin"));
		
		System.out.println("���Խ���");
	}
	
	@Test
	public void testInsert()
	{
		UserInfo ui = new UserInfo();
		ui.setUserId("TestId");
		ui.setUserName("TestName");
		ui.setPasswd("TestAdmin");
		
//		int test = testDao.insertUserInfo(ui);
		
		int t = testDao.updateUserinfo("TestId", "adminTest");
		System.out.println(t);
		
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	
	
}
