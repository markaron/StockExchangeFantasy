package sef.stockexchangefantasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sef.stockexchangefantasy.model.entity.Portfolio;

@Repository
public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {
}
