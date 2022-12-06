package kata6;//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

public class DRoot {
    public static int digital_root(int n) {

        String str = Integer.toString(n);
        String[] str_array = str.split("");

        int num = 0;
        while (str_array.length != 1) {
            num = 0;
            for (String s :
                    str_array) {
                num += Integer.parseInt(s);
                str_array = Integer.toString(num).split("");
            }
        }
        return num;
    }

}