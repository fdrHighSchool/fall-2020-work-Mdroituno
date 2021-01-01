import java.util.*;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
  
    // 30 rows and 10 columns
    int[][] grades = new int [30][10];
    int[] averages = new int [30];
    
    for (int row = 0; row < 30; row++) {
      int sum = 0;
      for(int col = 0; col < 10; col++){
        // get random number between 55 and 100
        grades[row][col] = rand.nextInt(100 - 55) + 55;
        sum += grades[row][col];
      }
      averages[row] = sum/10;
    }
    System.out.println("Averages of all students: " + Arrays.toString(averages));

    int maxInt = averages[0];
    for(int i = 1; i < 30; i++){
      if(averages[i] > maxInt)
        maxInt = averages[i];
    }
    System.out.println("Valedictorian: " + maxInt);
     
    int maxInt2 = averages[0];
    for(int i = 1; i < 30; i++){
      if(averages[i] == maxInt)
        averages[i] = 0;
      if(averages[i] > maxInt2)
        maxInt2 = averages[i];
    }
    System.out.println("Salutatorian: " + maxInt2);
  }
}