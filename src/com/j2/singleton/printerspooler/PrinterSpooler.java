package com.j2.singleton.printerspooler;

public class PrinterSpooler {
  private boolean empty;
  private boolean printed;
  protected static PrinterSpooler uniqueInstance;
  private static int numCalled = 1;
  
  protected PrinterSpooler() { //this Printer works when it is empty.
    empty = true;
    printed = false;
  }
  
  public static synchronized PrinterSpooler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Making unique instance of PrinterSpooler");
      uniqueInstance = new PrinterSpooler();
    }
    System.out.println("Returning instance: " + numCalled++);
    return uniqueInstance;
  }
 
  public void fill() {
    if (isEmpty()) {
      System.out.println("Fill the content");
      empty = false;
      printed = false;
    }
  }
  
  public void drain() {  
    if (!isEmpty() && isPrinted()) {  
      System.out.println("Drain the content");
      empty = true; 
    } 
  }
 
  public void print() { 
    if (!isEmpty() && !isPrinted()) {
      System.out.println("Printing");
      printed = true;
    } 
  }
   
  public boolean isEmpty() { 
    return empty;
  }

  public boolean isPrinted() {
    return printed;  
  }
  
}