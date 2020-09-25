package com.usm.usermanager.controller;

import com.usm.usermanager.model.User;
import com.usm.usermanager.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping(value = "/users")
  public List<User> getUsers() {
    return userService.getAllUsers();
  }
}
