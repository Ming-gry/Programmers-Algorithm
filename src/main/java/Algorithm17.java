public class Algorithm17 {
    public static void main(String[] args) {
        boolean answer;
        String s = "12346";

        if (s.length() == 4 || s.length() == 6){
            if(s.matches(".*[a-zA-z].*")){
                answer = false;
            }else answer = true;
        }else answer = false;

        System.out.println(answer);



    }
}
