//https://school.programmers.co.kr/learn/courses/30/lessons/81301
package hanghae;

public class Algorithm38 {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Algorithm38 algorithm38 = new Algorithm38();

        System.out.println(algorithm38.solution("23four5six7"));
    }
}
