import java.util.*;

public class Algorithm31 {
    public int[] solution(int[] arr) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (integerList.get(integerList.size() - 1) != arr[i]) {
                integerList.add(arr[i]);
            }
        }

        return integerList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Algorithm31 algorithm31 = new Algorithm31();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(algorithm31.solution(arr)));
    }
}
