package com.example.demo;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
@SpringBootTest(webEnvironment = RANDOM_PORT) 
public class TodoRestControllerTests {

  @Test
  public void shouldFetchTodos() {
    // to be implemented shortly
  }
  
  @Autowired
  private TestRestTemplate template;

}