//https://school.programmers.co.kr/learn/courses/30/lessons/77484
package hanghae;

import java.util.*;

public class Algorithm33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int best = 7;
        int worst = 7;
        List<Integer> winSet = new ArrayList<>();

        for (int win_num : win_nums) {
            winSet.add(win_num);
        }

        for (int lotto : lottos) {
            if (winSet.contains(lotto)) {
                best--;
                worst--;
            }

            if (lotto == 0){
                best--;
            }
        }

        if (best == 7){
            best = 6;
        }

        if (worst == 7){
            worst = 6;
        }

        return new int[]{best, worst};
    }

    public static void main(String[] args) {
        Algorithm33 algorithm33 = new Algorithm33();
        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};

        System.out.println(Arrays.toString(algorithm33.solution(lottos, win_nums)));
    }
}
