import java.util.Scanner;

public class Calculator{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String user = "";

    while(!(user.equals("quit"))){
      System.out.print("Write your problem or type quit to quit: ");
      user = in.nextLine();
      //System.out.println(user);
      if(!(user.equals("quit"))){
        produceAnswer(user);
      }// end if user not empty
    }//end while loop
  }//end main method
  /*
   *N: produceAnswer
   *P: solve the equation the user inputs
   *I: user input
   *R: solution to equation
   */
  public static int produceAnswer(String user){
    int[] splitOperands = inputSplit(user);
    /*
    for (int i =0; i<7; i++){
      System.out.println(splitOperands[i]);
    }
    */
    String operator = user.substring(splitOperands[3], splitOperands[3]+1);

    System.out.print("whole: " + splitOperands[4]);
    System.out.print(" numerator: " + splitOperands[5]);
    System.out.println(" denominator: " + splitOperands[6]);

    return 0;
  }//end produceAnswer method
  /*
   *N: inputSplit
   *P: split the user input into its parts
   *I: user input
   *R: array with all parts ordered
   */
  public static int[] inputSplit(String user){
    int space = user.indexOf(" ");
    int operatorIndex = space + 1;

    String first = user.substring(0,space);
    String second = user.substring(operatorIndex+2);
    //System.out.print(first);
    //System.out.print(second);

    int whole1 = wholeNum(first);
    int whole2 = wholeNum(second);

    int numer1 = numerator(first);
    int numer2 = numerator(second);

    int denom1 = denominator(first);
    int denom2 = denominator(second);

    int[] splitOperands = new int[7];
    //refer below for where each value is
    splitOperands[0] = whole1;
    splitOperands[1] = numer1;
    splitOperands[2] = denom1;
    splitOperands[3] = operatorIndex;
    splitOperands[4] = whole2;
    splitOperands[5] = numer2;
    splitOperands[6] = denom2;

    return splitOperands;
  }
  /*
   *N: wholeNum
   *P: get whole number, if it exists
   *I: one operand
   *R: whole number or 0
   */
  public static int wholeNum(String operand){
    if(operand.indexOf("_") != -1){
      String num = operand.substring(0,1);
      return Integer.parseInt(num);
    }
    else if(operand.indexOf("/") != -1){
      return 0;
    }
    else{
      return Integer.parseInt(operand);
    }
  }//end wholeNum method
  /*
   *N: numerator
   *P: get numerator, if exists
   *I: one operand
   *R: numerator or 0
   */
  public static int numerator(String operand){
    if(operand.indexOf("/") != -1){
      int line = operand.indexOf("/");
      String num = operand.substring(line-1, line);
      return Integer.parseInt(num);
    }
    else{return 0;}
  }//end numerator method
  /*
   *N: denominator
   *P: get denominator, if exists
   *I: one operand
   *R: denominator or 1
   */
  public static int denominator(String operand){
    if(operand.indexOf("/") != -1){
      int line = operand.indexOf("/");
      String num = operand.substring(line+1);
      return Integer.parseInt(num);
    }
    else{return 1;}
  }
}//end class
