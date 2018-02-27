package com.console.users.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.console.users.dao.GainerLosersDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-database-test.xml" })
public class GainerLosersDaoImplTest {

	@Autowired
	GainerLosersDao gainerLosersDao;

	@Test
	@Transactional
	@Rollback(true)
	public void getAllgainerLosers() {
		List ListOfGainersLosers = gainerLosersDao.getAllgainerLosers();
		assertEquals(12, ListOfGainersLosers.size());
	}

}
