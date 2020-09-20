package com.example.reddit.services;

import com.example.reddit.models.Users;
import java.util.List;

public interface UserService {
  List<Users> findAllUsers();

  void addUser(String uname, String email, String password);

  void deleteUserById(long id);

  Users findUserById(long id);
}
