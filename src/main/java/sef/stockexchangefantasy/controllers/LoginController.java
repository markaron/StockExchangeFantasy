package sef.stockexchangefantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sef.stockexchangefantasy.model.entity.StockHolder;
import sef.stockexchangefantasy.services.StockHolderService;
import sef.stockexchangefantasy.temp.Util;

@Controller
public class LoginController {

  StockHolderService stockHolderService;

  @Autowired
  public LoginController(StockHolderService stockHolderService) {
    this.stockHolderService = stockHolderService;
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String userLogin(@ModelAttribute(name = "name") String name) {
    StockHolder stockHolder = stockHolderService.login(name);
    Util.loggedInStockHolder = stockHolder;
    return "redirect:/portfolio";
  }
}
