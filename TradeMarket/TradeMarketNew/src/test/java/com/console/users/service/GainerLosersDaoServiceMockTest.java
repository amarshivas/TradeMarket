package com.console.users.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.console.users.dao.GainerLosersDao;
import com.console.users.dao.GainerLosersDaoImpl;
import com.console.users.model.GainersLosers;

@RunWith(SpringJUnit4ClassRunner.class)
public class GainerLosersDaoServiceMockTest {

	/*@Before
	public void setup() {
		List<GainersLosers> ListOfGainersLosers = Arrays.asList(
	            new GainersLosers(),
	            new GainersLosers();
	            when(userService.gainerLosersDaoService).thenReturn(ListOfGainersLosers);
			}.build(true);
			Mockito.when(accountRepository.findByUsername("john")).thenReturn(account);
	}

	@Configuration
	static class AccountServiceTestContextConfiguration {
	@Bean
	public GainerLosersDaoService gainerLosersDaoService() {
			return new GainerLosersDaoService();
	}
	
	@Bean
	public GainerLosersDao gainerLosersDao() {
			return Mockito.mock(GainerLosersDaoImpl.class);
	}

	
	*/
	@Test
	public void getAllgainerLosers() {
		/*List ListOfGainersLosers = gainerLosersDaoService.getAllgainerLosers();
		assertEquals(12, ListOfGainersLosers.size());*/
	}

}
