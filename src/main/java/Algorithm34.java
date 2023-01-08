import java.util.*;

public class Algorithm34 {
    public int[] solution(int[] answers) {
        List<Integer> arraylist = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] totalanswer = new int[3];

        for (int i = 0; i < answers.length; i++){
            if (arr1[i%5] == answers[i]){
                totalanswer[0]++;
            }

            if (arr2[i%8] == answers[i]){
                totalanswer[1]++;
            }

            if (arr3[i%10] == answers[i]){
                totalanswer[2]++;
            }
        }

        int max = totalanswer[0];

        for (int j : totalanswer) {
            if (j >= max) {
                max = j;
            }
        }

        for(int i=0; i<totalanswer.length; i++) {
            if(totalanswer[i] == max) {
                arraylist.add(i+1);
            }
        }

        int[] answer = new int[arraylist.size()];
        for(int i=0; i<arraylist.size(); i++) {
            answer[i] = arraylist.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm34 algorithm34 = new Algorithm34();
        int[] answers = {3,3,1,1,2,2,4,4,5,5};

        System.out.println(Arrays.toString(algorithm34.solution(answers)));
    }
}
