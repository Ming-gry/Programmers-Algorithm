import java.util.Arrays;
import java.util.Collections;

public class Algorithm24 {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[]arr = new String[s.length()];


        for (int i = 0; i< s.length(); i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        String joinArray = String.join("",arr);
        answer = Long.valueOf(joinArray);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm24 method = new Algorithm24();
        System.out.println(method.solution(118372));
    }
}
