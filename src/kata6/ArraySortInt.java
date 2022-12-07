package kata6;
import java.util.*;

public class ArraySortInt {
    public static int[] SortedInt(int[] arr){

        List<Integer> odd = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                numbers.add(arr[i]);
                odd.add(i);
            }
        }
        Collections.sort(numbers);
        int j = 0;
        for (int i = 0; i < odd.size(); i++) {
            arr[odd.get(i)] = numbers.get(j);
            System.out.println(odd.get(i));
            j++;
        }
        return arr;
    }

    public static void main(String[] arg){
        int[] arr = {66, 60, 91, 5, 70, 54, 35, 99, 35, 78, 26, 17, 30, 27, 35, 53, 13, 14, 20, 20, 17, 52, 54, 33, 3};
        SortedInt(arr);
    }
}
