package kata6;

public class Multiplesof3or5 {
    public static int solution(int number) {
        int num = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 | i % 5 == 0){
                num += i;
            }
        }
        return Math.max(num, 0);
    }

    public static void main(String[] args){
        int x = 10;
        System.out.println(solution(x));
    }
}
