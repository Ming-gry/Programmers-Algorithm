//https://school.programmers.co.kr/learn/courses/30/lessons/1845
package hanghae;

import java.util.HashSet;
import java.util.Set;

public class Algorithm50 {
    public int solution(int[] nums) {
        Set<Integer> pokemonSet = new HashSet<>();

        for (int i : nums){
            pokemonSet.add(i);
        }

        return Math.min(pokemonSet.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        Algorithm50 algorithm50 = new Algorithm50();
        int[] nums = {3,3,3,2,2,2};

        System.out.println(algorithm50.solution(nums));
    }
}
