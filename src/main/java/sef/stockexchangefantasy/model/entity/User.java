package sef.stockexchangefantasy.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long user_id;
  private String nickName;
  private double dollar;

  public User() {
  }

  public User(String nickName, double dollar) {
    this.nickName = nickName;
    this.dollar = dollar;
  }

  public long getId() {
    return user_id;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public double getDollar() {
    return dollar;
  }

  public void setDollar(double dollar) {
    this.dollar = dollar;
  }
}
