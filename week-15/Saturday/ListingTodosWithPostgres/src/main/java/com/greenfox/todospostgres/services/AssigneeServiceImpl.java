package com.greenfox.todospostgres.services;

import com.greenfox.todospostgres.models.Assignee;
import com.greenfox.todospostgres.repositories.AssigneeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService{

  private final AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();
  }

  @Override
  public void add(String name, String email) {
    assigneeRepository.save(new Assignee(name, email));
  }

  @Override
  public void deleteById(long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public Assignee findById(long id) {
    return assigneeRepository.findById(id).orElse(null);
  }

  @Override
  public Assignee editById(Assignee assignee) {
    return assigneeRepository.save(assignee);
  }
}

