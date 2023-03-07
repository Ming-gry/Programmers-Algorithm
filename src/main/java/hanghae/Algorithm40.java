//https://school.programmers.co.kr/learn/courses/30/lessons/72410
package hanghae;

public class Algorithm40 {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^-_.a-z0-9]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");

        if (answer.equals("")){
            answer += "a";
        }

        if (answer.length() >= 16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2){
            while (answer.length() < 3){
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm40 algorithm40 = new Algorithm40();

        System.out.println(algorithm40.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
