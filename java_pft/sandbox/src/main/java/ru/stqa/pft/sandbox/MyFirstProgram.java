package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(5, 6);

    System.out.println("Расстояние между точками " + p1.x + ":" + p1.y + " и " + p2.x + ":" + p2.y + " = " + p1.distance(p2));

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + area(r));
  }

  public static double area(Square s){
    return s.l * s.l;
  }
  public static double area(Rectangle r){
    return r.a * r.b;
  }
}
