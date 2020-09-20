package com.example.reddit.services;

import com.example.reddit.models.Users;
import com.example.reddit.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<Users> findAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public void addUser(String uname, String email, String password) {
    userRepository.save(new Users(uname, email, password));
  }

  @Override
  public void deleteUserById(long id) {
    userRepository.deleteById(id);

  }

  @Override
  public Users findUserById(long id) {

    return userRepository.findById(id).orElse(null);
  }
}
