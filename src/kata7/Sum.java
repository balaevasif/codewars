package kata7;
//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class Sum
{
    public static int GetSum(int a, int b)
    {
        int result = 0;
        if (a < b){
            for (int i = a; i <= b; i++) {
                result += i;
            }
        }
        else {
            for (int i = b; i <= a; i++) {
                result += i;
            }
        }
        return result;
    }
//    public static void main(String[] arg){
//        int a = -2;
//        int b = 5;
//        System.out.println(GetSum(a, b));
//    }
}
