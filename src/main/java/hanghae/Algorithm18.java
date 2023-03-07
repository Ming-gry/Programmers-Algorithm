//https://school.programmers.co.kr/learn/courses/30/lessons/12919
package hanghae;

public class Algorithm18 {
    public static void main(String[] args) {
        String[] seoul = new String[]{"Kim","Lee","Jane"};
        String answer = "";

        for(int i = 0; i< seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }

        System.out.println(answer);


    }
}
