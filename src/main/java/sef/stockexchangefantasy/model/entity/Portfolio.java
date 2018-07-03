package sef.stockexchangefantasy.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Portfolio {

  @Id
  private long portfolio_id;
  @OneToMany
  @JoinColumn(name="user_id")
  private List<User> user;
  @OneToMany
  @JoinColumn(name="stock_id")
  private List<Stock> stock;
  private Integer amount;

  public Portfolio() {
  }

  public Portfolio(long portfolio_id, List<User> user, List<Stock> stock, Integer amount) {
    this.portfolio_id = portfolio_id;
    this.user = user;
    this.stock = stock;
    this.amount = amount;
  }

  public long getPortfolio_id() {
    return portfolio_id;
  }

  public List<User> getUser() {
    return user;
  }

  public void setUser(List<User> user) {
    this.user = user;
  }

  public List<Stock> getStock() {
    return stock;
  }

  public void setStock(List<Stock> stock) {
    this.stock = stock;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
}
