//https://school.programmers.co.kr/learn/courses/30/lessons/12982
package hanghae;

import java.util.Arrays;

public class Algorithm43 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++){
            sum += d[i];
            if (sum > budget){
                answer = i;
                break;
            }
        }

        if (sum <= budget){
            answer = d.length;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm43 algorithm43 = new Algorithm43();
        int[] d = {1,3,2,5,4};

        System.out.println(algorithm43.solution(d, 9));
    }
}
