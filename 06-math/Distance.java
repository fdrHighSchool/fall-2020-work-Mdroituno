import java.util.Scanner;
import java.lang.Math;
public class Distance{
  public static void main(String[] args) {

    int x1 = coordInput("x",1);
    int y1 = coordInput("y",1);
    int x2 = coordInput("x",2);
    int y2 = coordInput("y",2);

    System.out.printf("The cartesian distance is %.5f\n",cartesianDistance(x1,y1,x2,y2));
    System.out.println("The taxicab distance is " + taxicabDistance(x1,y1,x2,y2));

  }

 /*
  * N: coordInput
  * P: get a certain coordinate from user
  * I: axis and if its first or second point
  * R: The user input for value of the inputed coordinate
  */
  public static int coordInput(String axis, int point){
    Scanner in = new Scanner(System.in);
    System.out.printf("What is the value of %s%d? ", axis, point);
    int user = in.nextInt();
    return user;
  }

 /*
  * N: cartesianDistance
  * P: Determine the distance between two points on the x/y axis
  * I: Two points
  * R: The distance between the two points
  */
  public static double cartesianDistance(int x1, int y1, int x2, int y2){
    // Distance formula = sqrt((x2-x1)^2 + (y2-y1)^2)
    return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
  }

 /*
  * N:taxicabDistance
  * P: Determine the distance between two points on a map grid
  * I: two points
  * R: the distance between the points
  */
  public static int taxicabDistance(int x1, int y1, int x2, int y2){
    int xDistance = Math.max(x1,x2) - Math.min(x1,x2);
    int yDistance = Math.max(y1,y2) - Math.min(y1,y2);

    return xDistance + yDistance;

  }
}
