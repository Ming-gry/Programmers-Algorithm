//https://school.programmers.co.kr/learn/courses/30/lessons/68644
package hanghae;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Algorithm32 {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < numbers.length; i++){
            for (int j = 1; j < numbers.length; j++){
                if (i == j){
                    continue;
                }
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().mapToInt(i -> i).sorted().toArray();
    }

    public static void main(String[] args) {
        Algorithm32 algorithm32 = new Algorithm32();
        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(algorithm32.solution(numbers)));
    }
}
