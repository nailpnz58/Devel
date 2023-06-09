package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    System.out.println("Hello, world");
    double a = 5.0;
    double b = 5.0;
      System.out.println("Площать прямогульника со сторонами " + a + " и " + b + " = " + area(a,b));
  }

  public static double area(double a, double b){
    return a * b;
  }
}
