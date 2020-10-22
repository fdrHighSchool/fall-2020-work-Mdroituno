import java.util.Scanner;
public class Temperature{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int conditional=0;
    System.out.print("Welcome! ");

    while (!(conditional==1 || conditional==2)){
      System.out.println("Enter the number relative to your needed conversion:");
      System.out.println("1. Convert Celsius to Fahrenheit");
      System.out.println("2. Convert Fahrenheit to Celsius");
      conditional = in.nextInt();

      if (conditional == 1){
        System.out.println("You selected to convert Celsius to Fahrenheit");
        System.out.print("Please enter degrees in Celsius: ");
        double celsius = in.nextDouble();

        System.out.printf("%.1f C = %.1f F", celsius ,fahrenheit(celsius));
      }//end if

      else if(conditional == 2){
        System.out.println("You selected to convert Fahrenheit to Celsius");
        System.out.print("Please enter degrees in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        System.out.printf("%.1f F = %.1f C", fahrenheit ,celsius(fahrenheit));
      }//end else if
      
      else{
        System.out.println("Invalid input");
      }//end else
    }//end while loop
  }// end main method

  public static double fahrenheit(double celsius ){
    return ((celsius*(9.0/5.0)) + 32.0);
  }//end fahrenheit method

  public static double celsius(double fahrenheit){
    return ((fahrenheit-32.0)*(5.0/9.0));
  }//end celsius method
}// end class
