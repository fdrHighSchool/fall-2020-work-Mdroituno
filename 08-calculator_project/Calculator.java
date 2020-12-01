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
        System.out.println(produceAnswer(user));
      }// end if user not empty
    }//end while loop
    in.close();
  }//end main method

  /*
   *N: produceAnswer
   *P: solve the equation the user inputs
   *I: user input
   *R: solution to equation
   */
  //public static int produceAnswer(String user){
  public static String produceAnswer(String user){
    //split parts of input
    int[] splitOperands = inputSplit(user);
    /*
    for (int i =0; i<7; i++){
      System.out.println(splitOperands[i]);
    }
    */

    /*
    System.out.print("whole: " + splitOperands[4]);
    System.out.print(" numerator: " + splitOperands[5]);
    System.out.println(" denominator: " + splitOperands[6]);
    */
    //find operator
    String operator = user.substring(splitOperands[3], splitOperands[3]+1);
    //System.out.println(calculation(splitOperands,operator));
    return simplify(calculation(splitOperands,operator));

  }//end produceAnswer method

  /*
   *N: calculation
   *P: calculate equation
   *I: array with all digits and operator
   *R: final calculation
   */
  public static String calculation(int[] splitOperands, String operator){
    //makes improper fractions
    int num1 = splitOperands[0] * splitOperands[2] + splitOperands[1];
    int num2 = splitOperands[4] * splitOperands[6] + splitOperands[5];
    //System.out.println(num1 + " " +  num2);

    //all calculations
    if(operator.equals("+")){
      int numer = (num1 * splitOperands[6]) + (num2 * splitOperands[2]);
      int denom = splitOperands[2] * splitOperands[6];
      String result = numer + "/" + denom;
      return result;
    }
    else if(operator.equals("-")){
      int numer = (num1 * splitOperands[6]) - (num2 * splitOperands[2]);
      int denom = splitOperands[2] * splitOperands[6];
      String result = numer + "/" + denom;
      return result;
    }
    else if(operator.equals("*")){
      int numer = num1 * num2;
      int denom = splitOperands[2] * splitOperands[6];
      String result = numer + "/" + denom;
      return result;
    }
    else if(operator.equals("/")){
      int numer = num1 * splitOperands[6];
      int denom = splitOperands[2] * num2 ;
      String result = numer + "/" + denom;
      return result;
    }
    return "error";
  }//end calculation method

  /*
   *N: simplify
   *P: to simplify result from calculation method
   *I: result of calculation()
   *R: simplified version of result
   */
  //public static int simplify(String result){
  public static String simplify(String result){
    //split numerator and denominator for easy use
    int division = result.indexOf("/");
    int numer = Integer.parseInt(result.substring(0,division));
    int denom = Integer.parseInt(result.substring(division+1));
    int whole = 0;

    int GCF = findGCF(numer,denom);
    numer /= GCF;
    denom /= GCF;

    if(numer > denom)
      whole = numer / denom;
    
    numer -= whole*denom;

    //set final answer to mathematical syntax
    String simplified = whole + "_" + numer + "/" + denom;
    if(whole == 0){
      simplified = numer + "/" + denom;
    }
    if(denom == 1 && simplified.contains("/") == true){
      int slashIndex = simplified.indexOf("/");
      simplified = simplified.substring(0,slashIndex);
    }

    if(numer == 0 && whole > 0){
      int wholeIndex = simplified.indexOf("_");
      simplified = simplified.substring(0,wholeIndex);
    }
    else if(numer == 0){
      simplified = Integer.toString(0);
    }

    //negative answers still get simplified
    if(result.substring(0,1).equals("-")){
      simplified = simplify(result.substring(1));
      simplified = "-" + simplified;
    }
    return simplified;
    //return numer;
    //return GCF;
    //return denom;
  }//end simplify method

  /*
   *N: inputSplit
   *P: split the user input into its parts
   *I: user input
   *R: array with all parts ordered
   */
  public static int[] inputSplit(String user){
    int space = user.indexOf(" ");
    int operatorIndex = space + 1;

    //split operands
    String first = user.substring(0,space);
    String second = user.substring(operatorIndex+2);
    //System.out.print(first);
    //System.out.print(second);

    int whole1 = wholeNum(first);
    int whole2 = wholeNum(second);

    String numer1 = numerator(first);
    if (Integer.toString(whole1).substring(0,1).equals("-")){
      numer1 = "-" + numerator(first);
    }
    String numer2 = numerator(second);
    if (Integer.toString(whole2).substring(0,1).equals("-")){
      numer2 = "-" + numerator(second);
    }

    int denom1 = denominator(first);
    int denom2 = denominator(second);

    int[] splitOperands = new int[7];
    //refer below for where each value is
    splitOperands[0] = whole1;
    splitOperands[1] = Integer.parseInt(numer1);
    splitOperands[2] = denom1;
    splitOperands[3] = operatorIndex;
    splitOperands[4] = whole2;
    splitOperands[5] = Integer.parseInt(numer2);
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
      String num = operand.substring(0,operand.indexOf("_"));
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
  public static String numerator(String operand){
    if(operand.indexOf("/") != -1){
      int line = operand.indexOf("/");
      String num = operand.substring(operand.indexOf("_")+1, line);
      return num;
    }
    else{return Integer.toString(0);}
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
  }//end denominator method

  /*
   *N:findGCF
   *P:get the GCF of two numbers
   *I:two numbers
   *R:GCF of the numbers
   */
  public static int findGCF(int first, int second){
    int min = Math.min(first,second);
    //System.out.println(min);
    //return 0;
    //if(first != second){
    for(int i = min; i>0; i--){
      if(first % i == 0 && second % i == 0){
        return i;
      }
    }
    return 1;
  }//end findGCF method
}//end class
