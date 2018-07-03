package sef.stockexchangefantasy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String userLogin(@ModelAttribute(name = "name") String name) {
    User user = userService.login(name);
    return "redirect:/portfolio";
  }
}
