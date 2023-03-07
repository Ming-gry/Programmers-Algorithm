//https://school.programmers.co.kr/learn/courses/30/lessons/12916
package hanghae;

public class Algorithm16 {
    public static void main(String[] args) {
        String s = "oooOoooooOOooooooooooOOOOOOOOOOOOOOOOOOOOyyyp";
        boolean answer;
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p'|| s.charAt(i)=='P') {
                countP++;
            } else if (s.charAt(i) == 'y'|| s.charAt(i)=='Y') {
                countY++;
            }
        }if (countP == countY){
            answer = true;
        }else if (countP != countY){
            answer = false;
        }else answer = true;

        System.out.println(answer);
    }
}
