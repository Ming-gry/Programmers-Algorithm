//https://school.programmers.co.kr/learn/courses/30/lessons/12934
package hanghae;

public class Algorithm25 {
    public long solution(long n) {
        long answer = 0;
        Double x = Math.sqrt(n);
        if(x == x.intValue()){
            answer = (long) Math.pow(x+1,2);
        }else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm25 method = new Algorithm25();
        System.out.println(method.solution(197));

    }
}
