package sef.stockexchangefantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import sef.stockexchangefantasy.services.PortfolioService;
import sef.stockexchangefantasy.temp.Util;

@Controller
public class PortfolioController {

  PortfolioService portfolioService;

  @Autowired
  public PortfolioController(PortfolioService portfolioService){
    this.portfolioService = portfolioService;
  }

  @GetMapping("/portfolio")
  public String showPortfolio(Model model) {
    model.addAttribute("user", Util.loggedInStockHolder);
    return "portfolio";
  }

}
