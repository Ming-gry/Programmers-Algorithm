public class Algorithm47 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++){
            answer += checkPrime(i) ? 1 : 0;
        }

        return answer;
    }

    public boolean checkPrime(int num){

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Algorithm47 algorithm47 = new Algorithm47();

        System.out.println(algorithm47.solution(10));
    }
}
