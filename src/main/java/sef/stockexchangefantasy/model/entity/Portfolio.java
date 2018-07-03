package sef.stockexchangefantasy.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long portfolio_id;
  @OneToMany
  @JoinColumn(name="user_id")
  private List<StockHolder> stockHolder;
  @OneToMany
  @JoinColumn(name="stock_id")
  private List<Stock> stock;
  private Integer amount;

  public Portfolio() {
  }

  public Portfolio(long portfolio_id, List<StockHolder> stockHolder, List<Stock> stock, Integer amount) {
    this.portfolio_id = portfolio_id;
    this.stockHolder = stockHolder;
    this.stock = stock;
    this.amount = amount;
  }

  public long getPortfolio_id() {
    return portfolio_id;
  }

  public List<StockHolder> getStockHolder() {
    return stockHolder;
  }

  public void setStockHolder(List<StockHolder> stockHolder) {
    this.stockHolder = stockHolder;
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
