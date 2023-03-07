//https://school.programmers.co.kr/learn/courses/30/lessons/12932
package hanghae;

import java.util.Arrays;

public class Algorithm23 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int count = 0;

        for (int i = s.length()-1; i>=0; i--){
            answer[count++] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm23 method = new Algorithm23();
        System.out.println(Arrays.toString(method.solution(12345)));

    }
}

