//https://school.programmers.co.kr/learn/courses/30/lessons/86491
package hanghae;

public class Algorithm30 {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;

        for (int i = 0; i < sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return max_w * max_h;
    }

    public static void main(String[] args) {
        Algorithm30 algorithm30 = new Algorithm30();
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

        System.out.println(algorithm30.solution(sizes));
    }
}
