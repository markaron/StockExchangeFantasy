package sef.stockexchangefantasy.services;

import org.springframework.stereotype.Component;
import sef.stockexchangefantasy.model.entity.StockHolder;

@Component
public interface StockHolderService {

  StockHolder login(String name);

}
