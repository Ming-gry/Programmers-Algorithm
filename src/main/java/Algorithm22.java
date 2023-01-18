public class Algorithm22 {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);

        for (int i = 0; i< s.length(); i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return answer;
    }


    public static void main(String[] args) {
        Algorithm22 method = new Algorithm22();
        System.out.println(method.solution(123));
    }
}
