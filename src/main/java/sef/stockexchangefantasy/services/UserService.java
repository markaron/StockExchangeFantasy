package sef.stockexchangefantasy.services;

import org.springframework.stereotype.Component;

@Component
public interface UserService {

  User login(String name);

}
