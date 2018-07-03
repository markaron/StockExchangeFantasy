package sef.stockexchangefantasy.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
  @Id
  private long stock_id;
  private String name;
  private String symbol;
  private double price;
  private boolean change;

  public Stock() {
  }

  public Stock(long stock_id, String name, String symbol, double price, boolean change) {
    this.stock_id = stock_id;
    this.name = name;
    this.symbol = symbol;
    this.price = price;
    this.change = change;
  }

  public long getId() {
    return stock_id;
  }

  public void setId(long id) {
    this.stock_id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isChange() {
    return change;
  }

  public void setChange(boolean change) {
    this.change = change;
  }
}
