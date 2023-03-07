//https://school.programmers.co.kr/learn/courses/30/lessons/12910
package hanghae;

import java.util.Arrays;

public class Algorithm14 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 36, 1, 13};
        int divisor = 1;
        int count = 0;
        int[] answer = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
            int num = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[num] = arr[i];
                    num++;
                }
            }
        }

        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
