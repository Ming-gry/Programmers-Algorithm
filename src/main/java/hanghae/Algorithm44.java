//https://school.programmers.co.kr/learn/courses/30/lessons/12940
package hanghae;

import java.util.Arrays;

public class Algorithm44 {
    public int[] solution(int n, int m) {
        int maximum = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0 && m % i == 0){
                maximum = i;
            }
        }

        int minimum = n * m / maximum;

        return new int[]{maximum, minimum};
    }

    public static void main(String[] args) {
        Algorithm44 algorithm44 = new Algorithm44();

        System.out.println(Arrays.toString(algorithm44.solution(2, 5)));
    }
}
