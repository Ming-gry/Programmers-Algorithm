//https://school.programmers.co.kr/learn/courses/30/lessons/42862
package hanghae;

public class Algorithm49 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] countCloset = new int[n];

        for (int i = 0; i < countCloset.length; i++){
            for (int j : lost) {
                if (i == j - 1) {
                    countCloset[i] -= 1;
                }
            }

            for (int k : reserve) {
                if (i == k - 1){
                    countCloset[i] += 1;
                }
            }
        }

        for (int i = 0; i < countCloset.length; i++) {
            if (countCloset[i] == -1) {
                if (i - 1 >= 0 && countCloset[i - 1] == 1){
                    countCloset[i]++;
                    countCloset[i-1]--;
                } else if (i + 1 < countCloset.length && countCloset[i + 1] == 1) {
                    countCloset[i]++;
                    countCloset[i + 1]--;
                } else answer--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm49 algorithm49 = new Algorithm49();
        int[] lost = {3};
        int[] reserve = {1};

        System.out.println(algorithm49.solution(3, lost, reserve));
    }
}
