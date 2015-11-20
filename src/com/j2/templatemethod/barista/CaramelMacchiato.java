package com.j2.templatemethod.barista;

public class CaramelMacchiato extends Coffee{
  Beverage beverage;
  public void brew(){
    System.out.println("Dripping coffee");
  }
  public void addCondiments(){
    beverage = new Espresso();
    beverage = new VanillaSyrup(beverage);
    beverage = new Milk(beverage);
    beverage = new Caramel(beverage);
    System.out.println("Adding "+beverage.getDescription());
    System.out.println("Cost: "+beverage.cost());
  }        
  
}