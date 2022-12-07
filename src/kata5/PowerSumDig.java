package kata5;
//https://www.codewars.com/kata/55f4e56315a375c1ed000159/train/java

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.pow;


public class PowerSumDig {

    public static long powerSumDigTerm(int n) {
        long max_value = Long.MAX_VALUE;
        List<Integer> num = new ArrayList<>();

        char[] numbers;
        int test;
        for (long i = 81; i < max_value; i++) {
            test = 0;
            numbers = Integer.toString((int) i).toCharArray();
            for (int j = 0; j < numbers.length; j++) {
                test += Integer.parseInt(String.valueOf(numbers[j]));
            }
            for (int j = 1; j < 4; j++) {
                if (pow(test, j) == i) {
                    num.add((int) i);
                }
            }
            if (num.size()+1 > n) break;
        }
        return num.get(num.size()-1);
    }

    public static void main(String[] arg){
        System.out.println(powerSumDigTerm(7));
    }
}
