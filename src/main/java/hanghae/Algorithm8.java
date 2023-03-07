//https://school.programmers.co.kr/learn/courses/30/lessons/12944
package hanghae;

public class Algorithm8 {
    public static void main(String[] args){


        int[]solution = new int[]{1,2,3,4};
        double answer = 0;

        for (int i = 0; i<solution.length; i++){
            answer += solution[i];
        } answer = answer/ solution.length;


        System.out.println(answer);

    }
}
