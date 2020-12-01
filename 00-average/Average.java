import java.util.Scanner;
public class  Average{
  public static void main(String[] args){
    System.out.print("Number of grades: ");
    int num = Input();

    // prints out the whole decimal
    System.out.println("Average: " + Calculation(num)/num);

  }// close method
  public static double Calculation(int num){
    float sum = 0;

    for(int i=0;i<num;i++){
      System.out.printf("Grade %d: ",i+1);
      sum += Input();
    }//close loop
    return sum;
  }//close method
  public static int Input(){
    Scanner in = new Scanner(System.in);

    return in.nextInt();
  }//close method
}//close class
