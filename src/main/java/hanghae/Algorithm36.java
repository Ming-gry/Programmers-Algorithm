//https://school.programmers.co.kr/learn/courses/30/lessons/12917
package hanghae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithm36 {
    public String mySolution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> lower = new ArrayList<>();
        List<String> upper = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            if (String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i)).toLowerCase())){
                lower.add(String.valueOf(s.charAt(i)));
            } else upper.add(String.valueOf(s.charAt(i)));
        }

        lower.sort(Comparator.reverseOrder());
        upper.sort(Comparator.reverseOrder());

        for (String value : lower) {
            answer.append(value);
        }

        for (String value : upper) {
            answer.append(value);
        }

        return answer.toString();
    }

    public String bestSolution(String s){
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        return new StringBuilder(new String(sol)).reverse().toString();
    }

    public static void main(String[] args) {
        Algorithm36 algorithm36 = new Algorithm36();
        System.out.println(algorithm36.bestSolution("Zbcdefg"));
    }
}
