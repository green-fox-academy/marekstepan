package com.greenfox.todospostgres.services;

import com.greenfox.todospostgres.models.Todo;
import com.greenfox.todospostgres.repositories.TodoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public List<Todo> findNotDone() {
    return todoRepository.findAll().stream()
        .filter(todo -> todo.isDone() == false)
        .collect(Collectors.toList());
  }

  @Override
  public void add(String title) {
    todoRepository.save(new Todo(title));
  }

  @Override
  public void deleteById(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public Object findById(long id) {
    return todoRepository.findById(id);
  }

  @Override
  public Object editById(Todo todo) {
    return todoRepository.save(todo);
  }
}


