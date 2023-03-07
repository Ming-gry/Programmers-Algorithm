//https://school.programmers.co.kr/learn/courses/30/lessons/12939
package curation;
public class Curation1 {

    public String solution(String s){
        int min = 0;
        int max = 0;

        String[] strings = s.split(" ");

        for (int i = 0; i < strings.length; i++){
            if (i == 0){
                min = Integer.valueOf(strings[i]);
                max = Integer.valueOf(strings[i]);
            }

            min = Integer.min(min, Integer.valueOf(strings[i]));
            max = Integer.max(max, Integer.valueOf(strings[i]));
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        Curation1 curation1 = new Curation1();

        System.out.println(curation1.solution("1 2 3 4"));
    }
}
