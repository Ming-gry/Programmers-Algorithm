//https://school.programmers.co.kr/learn/courses/30/lessons/70128
package hanghae;

public class Algorithm15 {
    public static void main(String[] args) {
        int[] a = new int[]{-1,0,1};
        int[] b = new int[]{1,0,-1};
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);

    }
}
