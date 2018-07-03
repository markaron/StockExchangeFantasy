package sef.stockexchangefantasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sef.stockexchangefantasy.model.entity.StockHolder;

@Repository
public interface StockHolderRepository extends CrudRepository<StockHolder, Long> {

  StockHolder findByNickName(String name);

}