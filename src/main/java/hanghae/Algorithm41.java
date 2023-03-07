//https://school.programmers.co.kr/learn/courses/30/lessons/77884
package hanghae;

public class Algorithm41 {
    public int mySolution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++){
            int count = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count ++;
                }
            }

            if (count % 2 == 0){
                answer += i;
            } else answer -= i;
        }

        return answer;
    }

    public int bestSolution(int left, int right){
        int answer = 0;

        for (int i=left;i<=right;i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }

            else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm41 algorithm41 = new Algorithm41();

        System.out.println(algorithm41.mySolution(24,27));
    }
}
