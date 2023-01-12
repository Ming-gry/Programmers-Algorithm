public class Algorithm42 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm42 algorithm42 = new Algorithm42();

        System.out.println(algorithm42.solution(5));
    }
}
