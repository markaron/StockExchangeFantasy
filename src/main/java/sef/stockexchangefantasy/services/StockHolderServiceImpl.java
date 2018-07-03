package sef.stockexchangefantasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sef.stockexchangefantasy.model.entity.StockHolder;
import sef.stockexchangefantasy.repository.StockHolderRepository;

@Component
public class StockHolderServiceImpl implements StockHolderService {

  @Autowired
  StockHolderRepository stockHolderRepository;

  @Override
  public StockHolder login(String name) {
    if (!name.equals("")) {
      StockHolder stockHolder = stockHolderRepository.findByNickName(name);
      if (stockHolder == null) {
        stockHolder = new StockHolder(name, 1000);
        stockHolderRepository.save(stockHolder);
        return stockHolder;
      }
      return stockHolder;
    }
    return null;
  }
}
