//https://school.programmers.co.kr/learn/courses/30/lessons/76501
package hanghae;

public class Algorithm7 {
    public static void main(String[] args){
        int[] absolutes = new int[]{1,2,3};
        boolean[] signs = new boolean[]{false, false, true};

        int answer = 0;

        for (int i = 0; i<absolutes.length; i++){
            if (signs[i] == true){
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
    }
}
