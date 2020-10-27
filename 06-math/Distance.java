import java.util.Scanner;
import java.lang.Math;
public class Distance{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("What is the first point?(x, y) ");
    String point1 = in.nextLine();
    System.out.print("What is the second point?(x, y) ");
    String point2 = in.nextLine();

    int x1 = getX(point1);
    int y1 = getY(point1);
    int x2 = getX(point2);
    int y2 = getY(point2);

    System.out.printf("The cartesian distance is %.5f\n",cartesianDistance(x1,y1,x2,y2));
    System.out.println("The taxicab distance is " + taxicabDistance(x1,y1,x2,y2));

  }//end main method

 /*
  * N: cartesianDistance
  * P: Determine the distance between two points on the x/y axis
  * I: Two points
  * R: The distance between the two points
  */
  public static double cartesianDistance(int x1, int y1, int x2, int y2){
    // Distance formula = sqrt((x2-x1)^2 + (y2-y1)^2)
    return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
  }//end cartesianDistance method

 /*
  * N: taxicabDistance
  * P: Determine the distance between two points on a map grid
  * I: two points
  * R: the distance between the points
  */
  public static int taxicabDistance(int x1, int y1, int x2, int y2){
    //
    int xDistance = Math.max(x1,x2) - Math.min(x1,x2);
    int yDistance = Math.max(y1,y2) - Math.min(y1,y2);

    return xDistance + yDistance;
  }//end taxicabDistance method

 /*
  * N: getX
  * P: Take the x value from user input
  * I: user input point
  * R: integer x value
  */
  public static int getX(String point){
    //locate the comma
    int comma = point.indexOf(",");

    //we know the x-value in the String starts at index 1
    //we now know where the comma is
    //so, the x-value is from index 1 to the location of the comma
    String x = point.substring(1, comma);

    return Integer.parseInt(x);
  }//end getX method

 /*
  * N: getY
  * P: Take the y value from user input
  * I: user input point
  * R: integer y value
  */
  public static int getY(String point){
    //locate the comma
    int comma = point.indexOf(",");
    //locate the closing parethesis
    int close = point.indexOf(")");

    //we know the x-value in the String starts at index 1
    //we now know where the comma is
    //so, the x-value is from index 1 to the location of the comma
    String y = point.substring(comma+2, close);

    return Integer.parseInt(y);
  }

}
