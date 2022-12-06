package kata6;//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] ar1, String[] ar2){

        List<String> list = new ArrayList<>();
        //for (int i = 0; i < ar1.length; i++) {
        //  for (int j = 0; j < ar2.length; j++) {
        for (String s : ar1) {
            for (String value : ar2) {
                if (value.contains(s)) {
                    if (!list.contains(s)) {
                        list.add(s.toLowerCase());
                    }
                }
            }
        }
        String[] new_array = list.toArray(String[]::new);
        Arrays.sort(new_array);
        return new_array;
    }
}
