package org.nagp;

public class App {

  private static final String MESSAGE="Hello world!";

  public static void main(String[] args) {
    System.out.println(MESSAGE);
  }

  public String getMessage(){
    return MESSAGE;
  }
}