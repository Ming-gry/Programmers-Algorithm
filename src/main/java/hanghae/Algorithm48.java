//https://school.programmers.co.kr/learn/courses/30/lessons/42889
package hanghae;

import java.util.*;

public class Algorithm48 {
    static class Rate {
        int index;
        double rate;

        public Rate (int index, double rate){
            this.index = index;
            this.rate = rate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N];
        int[] notClear = new int[N];
        List<Rate> rateList = new ArrayList<>();

        for (int i = 0; i < N; i++){
            for (int j = 0; j < stages.length; j++){
                if (stages[j] >= i + 1){
                    clear[i] += 1;
                }

                if (stages[j] == i + 1){
                    notClear[i] += 1;
                }
            }

            if (clear[i] == 0){
                rateList.add(new Rate(i + 1, 0));
            } else rateList.add(new Rate(i + 1, (double) notClear[i] / clear[i]));
        }

        rateList.sort(((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        for (int i = 0; i < answer.length; i++){
            answer[i] = rateList.get(i).index;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm48 algorithm48 = new Algorithm48();
        int[] stages = {3,3,3,3,3};

        System.out.println(Arrays.toString(algorithm48.solution(4, stages)));
    }
}
