package com.project.loginpage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.loginpage.Service.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("")
  public String home(){
    return "boom home page";
  }

  @RequestMapping(value = "/addUser", method = RequestMethod.POST)
  public String userRegistration(@RequestParam String firstName, @RequestParam String lastName,
      @RequestParam String emailId, @RequestParam String password) {
    return userService.addUser(firstName, lastName, emailId, password);
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(@RequestParam String emailId, @RequestParam String password) {
    return "";
  }

  @GetMapping("/loginSuccessfully")
  public String sucess(){
    return "sucess";
  }

}
