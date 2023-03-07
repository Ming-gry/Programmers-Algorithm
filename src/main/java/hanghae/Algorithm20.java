//https://school.programmers.co.kr/learn/courses/30/lessons/42576
package hanghae;

import java.util.Arrays;

public class Algorithm20 {
    public static void main(String[] args) {

        String[] participant = new String[]{"leo","kiki","eden"};
        String[] completion = new String[]{"kiki","eden"};
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";

        for (int i = 0; i< completion.length; i++){
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            if(i==completion.length-1){
                answer = participant[i+1];
            }
        }

        System.out.println(answer);

    }
}
