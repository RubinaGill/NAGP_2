package org.nagp;

public class Basic {

  public Basic(){}

  public int compareNumbers(int n1, int n2){
    if(n1<n2){
      return -1;
    }else if (n1>n2){
      return 1;
    }
    return 0;
  }
}