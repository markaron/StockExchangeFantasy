package sef.stockexchangefantasy.services;

import org.springframework.stereotype.Component;
import sef.stockexchangefantasy.model.entity.Portfolio;

@Component
public interface PortfolioService {

  Portfolio getPortfolio();
}
