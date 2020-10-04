package com.greenfox.todospostgres.services;

import com.greenfox.todospostgres.models.Assignee;
import java.util.List;

public interface AssigneeService {

  List<Assignee> findAll();

  void add(String name, String email);

  void deleteById(long id);

  Assignee findById(long id);

  Assignee editById(Assignee assignee);

}