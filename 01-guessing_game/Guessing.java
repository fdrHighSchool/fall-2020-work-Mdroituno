import java.util.Scanner;
public class Guessing {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   while (1==1){
     int max = 0;
     int min = 1;
     int level = 0;

     System.out.print("Hello, and welcome to my Number Guessing Game! What is your name? ");
     String name = in.nextLine();
     System.out.printf("Hello %s! ",name);
     while (!(level>0 && level<5)){
       System.out.println("Enter 1 to guess up to 10, 2 to guess up to 100, 3 to guess up to 1000 and 4 to guess up to 10000");
       level = in.nextInt();

       if (level == 1){
         max = 10;
         break;
       }else if (level == 2){
         max = 100;
         break;
       }else if (level == 3){
         max = 1000;
         break;
       }else if (level == 4){
         max = 10000;
         break;
       }else{
         System.out.println("Invalid input, only 1-4 are valid numbers.");
       }// end conditional chain to determine maximum for game
     }//end while level

     final int NUMBER = ((int)(Math.random() * max)+1);

     int guess = 0;
     int guesses = 0;
     while (guess != NUMBER){
       System.out.printf("What is your guess?(%d - %d)",min,max); // question of the game
       guesses++;
       guess = in.nextInt();

       if (guess<NUMBER){
         System.out.printf("Sorry %s, too Low!\n",name);
         if(guess >= min){ // this is so the minumum doesn't decrease in the question
           min = guess + 1;
         }
       } else if(guess>NUMBER){
           System.out.printf("Sorry %s, too High!\n",name);
           if(guess <= max){// this is so the maximum doesn't increase in the question
             max = guess - 1;
          }
       }// end else if guess > number
     }// end guess != number loop

     System.out.printf("Good Job %s! The correct answer was %d, It took you %d tries. Enter 1 to try again and any other number to stop.",name, NUMBER, guesses); // winning line
     int conditional = in.nextInt();

     if (conditional != 1){ // stops code
       break;
     }

    }// end while 1==1 loop
    in.close();

  }// end method main
}// end class main
