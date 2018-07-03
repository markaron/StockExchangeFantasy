package sef.stockexchangefantasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sef.stockexchangefantasy.model.entity.Portfolio;
import sef.stockexchangefantasy.repository.PortfolioRepository;

@Component
public class PortfolioServiceImpl implements PortfolioService {

  @Autowired
  PortfolioRepository portfolioRepository;


  @Override public Portfolio getPortfolio() {
    return null;
  }
}
