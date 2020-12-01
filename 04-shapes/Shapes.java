import java.util.Scanner;
public class Shapes{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Enter number assigned to the shape you want:");
    System.out.println("1.Rectangle");
    System.out.println("2.Triangle");
    System.out.println("3.Circle");
    System.out.println("4.Trapezoid");
    System.out.println("5.Square");
    int shape = in.nextInt();

    if (shape==1){
      System.out.print("What is the width of the rectangle?");
      int a = in.nextInt();
      System.out.print("What is the height of the rectangle?");
      int b = in.nextInt();
      System.out.println("The area of the rectangle is " + rectangle(a,b));
    }//end if shape=1
    else if (shape==2){
      System.out.print("What is the width of the triangle?");
      int a = in.nextInt();
      System.out.print("What is the height of the triangle?");
      int b = in.nextInt();
      System.out.println("The area of the triangle is " + triangle(a,b));
    }//end if shape=2
    else if(shape==3){
      System.out.print("What is the radius of the circle?");
      int r = in.nextInt();
      System.out.printf("The area of the circle is approximately %.2f", circle(r));
    }
    else if(shape==4){
      System.out.print("What is the width of the first side of the trapezoid?");
      int a = in.nextInt();
      System.out.print("What is the width of the second side of the trapezoid?");
      int b = in.nextInt();
      System.out.print("What is the height of the trapezoid?");
      int h = in.nextInt();
      System.out.println("The area of the trapezoid is " + trapezoid(a,b,h));
    }
    else if(shape==5){
      System.out.print("What is the length of the sides?");
      int s = in.nextInt();
      System.out.println("The area of the trapezoid is " + rectangle(s));
    }//end if chain

  }//end method main

  public static int rectangle(int a, int b){
    // A= a*b
    return a*b;
  }//end method rectangle

  public static int rectangle(int s){
    // A = s^2
    return s*s;
  }
  public static double triangle(double a, double b){
    // A= (a*b)/2
    return (a*b)/2;
  }//end method triangle

  public static double circle(int r){
    //A= pi*r^2
    return Math.PI*(r*r);
  }//end method circle

  public static double trapezoid(int a, int b, double h){
    //A= ((a+b)/2)*h
    return ((a+b)*h)/2;
  }//end method trapezoid
}//end class
