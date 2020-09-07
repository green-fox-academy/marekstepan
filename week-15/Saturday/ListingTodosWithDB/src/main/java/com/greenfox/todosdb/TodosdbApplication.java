package com.greenfox.todosdb;

import com.greenfox.todosdb.models.Todo;
import com.greenfox.todosdb.repositories.TodoRepository;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosdbApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  TodosdbApplication(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodosdbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Finish today's exercises"));
    todoRepository.save(new Todo("Finish yesterday's exercises"));
    todoRepository.save(new Todo("Finish the day before yesterday's exercises"));
    todoRepository.save(new Todo("One step forward with the side project"));
  }
}