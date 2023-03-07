//https://school.programmers.co.kr/learn/courses/30/lessons/12903
package hanghae;

public class Algorithm3 {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }

        return answer;
    }
}
