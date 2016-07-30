package com.wyt.testunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyt.test.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
//需要配置数据源的相关信息
@ContextConfiguration(locations={"file:src/main/resources/spring/applicationContext.xml"})
public class TestDaotest {
	
	@Autowired
	private TestDao testDao;
	
	@Test
	public void testDao()
	{
		System.out.println("测试开始");
		System.out.println(testDao.qruUserId("admin"));
		System.out.println("测试结束");
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	
	
}
