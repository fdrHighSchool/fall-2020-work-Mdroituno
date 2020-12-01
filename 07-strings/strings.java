import java.util.Scanner;
public class strings {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String input = "";

    while(input.isEmpty() == true){
      System.out.println("Type any word or phrase to know the total length including spaces");
      input = in.nextLine();

      if(input.isEmpty() == true){
        System.out.println("Please write a word");
      }
    }
    System.out.println(input.length());
  }
}
