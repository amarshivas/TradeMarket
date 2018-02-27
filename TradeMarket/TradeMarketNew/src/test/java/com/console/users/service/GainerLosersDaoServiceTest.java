package com.console.users.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-database-test.xml" })
public class GainerLosersDaoServiceTest {

	@Autowired
	GainerLosersDaoService gainerLosersDaoService;

	@Test
	public void getAllgainerLosers() {
		List ListOfGainersLosers = gainerLosersDaoService.getAllgainerLosers();
		assertEquals(12, ListOfGainersLosers.size());
	}

}
