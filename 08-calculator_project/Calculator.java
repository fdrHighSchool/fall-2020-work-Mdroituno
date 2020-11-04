import java.util.Scanner;

public class Calculator{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String user = " ";

    while(user.isEmpty() == false){
      System.out.print("Write your problem or leave it empty to quit: ");
      user = in.nextLine();
      if(user != ""){
        System.out.println(produceAnswer(user));
      }// end if user not empty

    }//end while loop
  }//end main method
  public static String produceAnswer(String user){
    int space = user.indexOf(" ");
    int operatorIndex = space + 1;

    String operator = user.substring(operatorIndex, operatorIndex+1);
    String second = user.substring(operatorIndex+2);
    return second;
  }//end produceAnswer
}//end class
