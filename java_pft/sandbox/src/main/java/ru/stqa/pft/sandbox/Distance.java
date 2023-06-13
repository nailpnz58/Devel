package ru.stqa.pft.sandbox;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point(1, 2, 3, 4);

    System.out.println("Расстояние между точками " + p.x1 + ":" + p.x2 + " и " + p.y1 + ":" + p.y2 + " равно "+ distance(p));
  }

  public static double distance(Point p){
    return Math.sqrt((Math.pow((p.y1 - p.x1), 2))+((Math.pow((p.y2 - p.x2), 2))));
  }
}
