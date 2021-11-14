package com.pr.web;



import com.pr.service.ColorsService;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pr.persistence.ColorsDAO;


import sun.print.resources.serviceui;

import com.pr.domain.ColorsVO;
import com.pr.persistence.ColorsDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ColorsDAOTest {

	@Inject
	ColorsDAO dao;
	private static Logger logger = LoggerFactory.getLogger(ColorsDAOTest.class);

	@Test
	public void testListAll() throws Exception {
		logger.info(dao.find_two("gogh",  "#B08D57", "#9C7C38").toString());
	}

}
