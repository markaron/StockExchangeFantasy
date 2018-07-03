package sef.stockexchangefantasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sef.stockexchangefantasy.model.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}