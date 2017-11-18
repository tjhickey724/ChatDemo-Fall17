package demo;

import java.util.Scanner;
import lib.Geometry;
import lib.TextIO;

/**
This shows how to use the lib.Geometry class to calculate Cylinder volumes
@author Tim Hickey
*/
public class Cylinders {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double r,h,volume,area,ratio;
    do {
      System.out.println("Enter a radius: ");
      r = scanner.nextDouble(); scanner.nextLine();
      System.out.println("Enter a height: ");
      h = scanner.nextDouble(); scanner.nextLine();
      volume = Geometry.cylinderVolume(r,h);
      area = Geometry.cylinderArea(r,h);
      ratio = volume/area;
      System.out.printf("r=%f h=%f%n v=%f a=%f v/a=%f%n%n",r,h,volume,area,ratio);
    } while(h>0 && r>0);
    System.out.println("bye!");
  }

}
