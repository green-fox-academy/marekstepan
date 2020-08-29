package com.example.greenfoxclassapp.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  private List<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count(){
    return names.size();
  }

  public Boolean isMember(String name) {
    for (String student : names) {
      if (student.equals(name)) {
        return true;
      }
    }
    return false;
  }
}
