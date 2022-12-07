package kata5;

import java.util.Arrays;

public class Scramblies {

    public static boolean scramble(String str1, String str2){
        char[] str_1 = str1.toCharArray();
        char[] str_2 = str2.toCharArray();

        for (int i = 0; i < str_2.length; i++) {
            //System.out.println(str_2[i]);
            for (int j = 0; j < str_1.length; j++) {
                //System.out.println(str_1[j]);
                if (str_2[i] == str_1[j]){
                    str_2[i] = ' ';
                    str_1[j] = ' ';
                }
            }
        }
        Arrays.sort(str_2);
        boolean empty = false;

        for (int i = 0; i < str_2.length; i++) {
            if (str_2[i] == ' '){
                empty = true;
            }
            else empty = false;
        }
        return empty;
    }

    public static void main(String[] arg){
        String str1 = "fsigfadav";
        String str2 = "asifa";
        //scramblies(str1, str2);
        System.out.println(scramble(str1, str2));
    }
}
