import java.util.*;
import java.io.*;
public class AoC_2019_Day_1 {
    public static void main(String[] args) {
        int sum = 0;
        try{
          Scanner s = new Scanner(new File("data.txt"));
    
          while(s.hasNext()){
            int module = Integer.parseInt(s.next());
            module /= 3;
            module -= 2;
            sum += module;
          }//end while loop
    
          s.close();
        }//end try
    
        catch(Exception e){
            System.out.println("file not found");
        }//end catch
        System.out.println(sum);
    }
}
