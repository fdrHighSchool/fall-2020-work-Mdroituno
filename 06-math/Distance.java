import java.lang.Math;
public class Distance{
  public static void main(String[] args) {
    int x1 = 8;
    int x2 = 3;
    int y1 = 10;
    int y2 = 9;
    System.out.printf("The cartesian distance is %.5f\n",cartesianDistance(x1,y1,x2,y2));
    System.out.println("The taxicab distance is "(x1,y1,x2,y2));

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
