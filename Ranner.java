package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Component
public class Ranner implements CommandLineRunner {

  private final Logger logger = LoggerFactory.getLogger(Ranner.class);

  private final HelloService helloService;
  //private final TodoRepository todoRepository;
  private final TodoJpaRepository todoRepository;
  
  //private HelloService helloService;
  //private TodoRepository todoRepository;

  //public Ranner(HelloService helloService) {
  //public Ranner(HelloService helloService, TodoRepository todoRepository) {
  public Ranner(HelloService helloService, TodoJpaRepository todoRepository) {	  
    this.helloService = helloService;
    this.todoRepository = todoRepository;
    //logger.debug("exiting run method..");
    //return this;
  }

  @Override
  public void run(String... args) throws Exception {
    helloService.greet();
    
    LocalDate nextWeek = LocalDate.now().plus(7, ChronoUnit.DAYS);
    
        todoRepository.save(Todo.builder()
            .title("Shop")
            .description("Go shopping ahead of trip")
            .dueDate(nextWeek).build());
        todoRepository.save(Todo.builder()
            .title("Pack")
            .description("Be sure to pack your things")
            .dueDate(nextWeek).build());
        todoRepository.save(Todo.builder()
            .title("Drive")
            .description("Drive to the airport")
            .dueDate(nextWeek).build());
        todoRepository.save(Todo.builder()
            .title("Fly")
            .description("Fly to some mysterious destination")
            .dueDate(nextWeek).build());
    
    logger.debug("exiting run method..");
  }
}
