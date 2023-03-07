//https://school.programmers.co.kr/learn/courses/30/lessons/12915
package hanghae;

import java.util.*;

public class Algorithm35 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++){
            answer[i] = String.valueOf(strings[i].charAt(n));
        }
        Arrays.sort(answer);

        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        for (int i = 0; i < answer.length; i++){
            for (int j = 0; j < stringList.size(); j++){
                if (String.valueOf(stringList.get(j).charAt(n)).equals(answer[i])){
                    answer[i] = stringList.get(j);
                    stringList.remove(stringList.get(j));
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm35 algorithm35 = new Algorithm35();
        String[] strings = {"abce", "abcd", "cdx"};

        System.out.println(Arrays.toString(algorithm35.solution(strings, 1)));
    }
}
