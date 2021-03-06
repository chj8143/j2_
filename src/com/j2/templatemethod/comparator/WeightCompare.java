package com.j2.templatemethod.comparator;

import java.util.Comparator;

public class WeightCompare implements Comparator<Object> {
 
  
 public int compare(Object obj1, Object obj2) {
  Duck d1 = (Duck)obj1;
  Duck d2 = (Duck)obj2;
  if (d1.weight < d2.weight) {
    return -1;
  } else if (d1.weight == d2.weight) {
    return 0;
  } else { // this.weight > otherDuck.weight
    return 1;
  }
 }
}