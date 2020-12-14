import java.util.*;
public class SelfDivisor {
    public static void main(String[] args){
        System.out.println(isSelfDivisor(128));
        System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3)));
    }

    public static boolean isSelfDivisor(int number){
        String num = Integer.toString(number);
        int[] digits = new int[num.length()];
        for (int i = 0; i<num.length(); i++){
            digits[i] = num.charAt(i) - '0';
            if(number % digits[i] != 0)
                return false;
        }
        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num){
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            start++;
            if(isSelfDivisor(start)){
                arr[i] = start;
            }else i--;
        }
        return arr;
    }
}
