import java.util.Arrays;

public class Algorithm26 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int min = arr[0];

        for (int i = 0; i< arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int count = 0;

        for (int i = 0; i< arr.length; i++){
            if(min == arr[i]){
                continue;
            }
            answer[count++] = arr[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        Algorithm26 method = new Algorithm26();
        int[] arr = new int[]{4, 3, 2, 1};
        System.out.println(Arrays.toString(method.solution(arr)));


    }
}
