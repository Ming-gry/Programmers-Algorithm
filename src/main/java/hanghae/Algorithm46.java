//https://school.programmers.co.kr/learn/courses/30/lessons/87389
package hanghae;

public class Algorithm46 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++){
            if (n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm46 algorithm46 = new Algorithm46();

        System.out.println(algorithm46.solution(12));
    }
}
