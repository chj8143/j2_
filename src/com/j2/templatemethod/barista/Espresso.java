package com.j2.templatemethod.barista;

public class Espresso extends Beverage {
  
 public Espresso() {
  description = "Espresso";
 }
  
 public double cost() {
  return 1.99;
 }
}