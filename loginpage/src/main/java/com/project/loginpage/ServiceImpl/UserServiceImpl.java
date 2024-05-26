package com.project.loginpage.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.loginpage.Entity.User;
import com.project.loginpage.Repository.UserRepository;
import com.project.loginpage.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public String addUser(String firstName, String lastName, String emailId, String password) {
    try {
      User newUser = new User();
      newUser.setFirstName(firstName);
      newUser.setLastName(lastName);
      newUser.setEmailId(emailId);
      newUser.setPassword(password);
      userRepository.save(newUser);
      return "success";
    } catch (Exception e) {
      System.out.println(e);
      return "failed";
    }
  }
}
