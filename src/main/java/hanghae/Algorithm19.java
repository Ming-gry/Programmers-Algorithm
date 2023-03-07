//https://school.programmers.co.kr/learn/courses/30/lessons/12922
package hanghae;

public class Algorithm19 {
    public static void main(String[] args) {
        int n = 5;
        String answer = "";
        int num = n / 2;
        int num1 = n % 2;

        for (int i = 0; i < num; i++) {
            answer += "수박";
        }
        if (num1 != 0) {
            answer += "수";
        }

        System.out.println(answer);

    }
}
