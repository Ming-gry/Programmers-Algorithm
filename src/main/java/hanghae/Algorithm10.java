//https://school.programmers.co.kr/learn/courses/30/lessons/12950
package hanghae;

import java.util.Arrays;

public class Algorithm10 {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = {};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
