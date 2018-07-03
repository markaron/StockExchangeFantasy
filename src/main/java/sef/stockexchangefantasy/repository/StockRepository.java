package sef.stockexchangefantasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sef.stockexchangefantasy.model.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {
}
