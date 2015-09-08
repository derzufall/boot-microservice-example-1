package de.derzufall.microservice.springbootjsf.example.test;

import de.derzufall.microservice.springbootjsf.example.SpringBootJsfApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootJsfApplication.class)
@WebAppConfiguration
public class SpringBootJsfApplicationTests {

	@Test
	public void contextLoads() {
	}

}
