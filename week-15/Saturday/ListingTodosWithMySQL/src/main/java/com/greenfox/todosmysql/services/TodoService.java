package com.greenfox.todosmysql.services;

import com.greenfox.todosmysql.models.Todo;
import java.util.List;
import java.util.Optional;

public interface TodoService {
  List<Todo> findAll();

  List<Todo> findNotDone();

  void add(String title);

  void deleteById(long id);

  Object findById(long id);

  Object editById(Todo todo);


}
