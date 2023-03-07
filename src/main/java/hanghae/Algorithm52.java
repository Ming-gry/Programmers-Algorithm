//https://school.programmers.co.kr/learn/courses/30/lessons/67256
package hanghae;

public class Algorithm52 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;

        for(int i: numbers){
            if(i == 1 || i == 4 || i == 7){
                answer.append("L");
                left = i;

            }else if(i == 3 || i == 6 || i == 9){
                answer.append("R");
                right = i;

            }else {

                if(i == 0) i = 11;
                int leftNum = Math.abs(i - left) / 3 + Math.abs(i - left) % 3;
                int rightNum = Math.abs(i - right) / 3 + Math.abs(i - right) % 3;

                if(leftNum<rightNum){
                    answer.append("L");
                    left = i;

                }else if(leftNum>rightNum){
                    answer.append("R");
                    right = i;

                }else{
                    if(hand.equals("left")){
                        answer.append("L");
                        left = i;
                    }else{
                        answer.append("R");
                        right = i;
                    }
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Algorithm52 algorithm52 = new Algorithm52();
        int[] numbers = {7,0,8,2,8,3,1,5,7,6,2};

        System.out.println(algorithm52.solution(numbers,"left"));
    }
}
