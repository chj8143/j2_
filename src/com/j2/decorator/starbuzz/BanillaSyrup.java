package com.j2.decorator.starbuzz;

public class BanillaSyrup extends CondimentDecorator {
 
 public BanillaSyrup(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", BanillaSyrup";
 }
 
 public double cost() {
  return .10 + beverage.cost();
 }
}