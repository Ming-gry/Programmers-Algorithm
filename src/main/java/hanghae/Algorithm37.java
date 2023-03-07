//https://school.programmers.co.kr/learn/courses/30/lessons/12977
package hanghae;

public class Algorithm37 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];

                    answer += checkPrime(sum) ? 1 : 0;
                }
            }
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
        Algorithm37 algorithm37 = new Algorithm37();
        int[] nums = {1,2,7,6,4};

        System.out.println(algorithm37.solution(nums));
    }
}
