package com.greenfox.todospostgres.services;

import com.greenfox.todospostgres.models.Todo;
import java.util.List;

public interface TodoService {
  List<Todo> findAll();

  List<Todo> findNotDone();

  void add(String title);

  void deleteById(long id);

  Object findById(long id);

  Object editById(Todo todo);


}
