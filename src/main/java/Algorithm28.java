public class Algorithm28 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] s = String.valueOf(x).split("");

        for (int i = 0; i<s.length; i++){
            sum += Integer.parseInt(s[i]);
        }

        if (x%sum != 0){
            answer = false;
        }

        return answer;

    }

    public static void main(String[] args) {
        Algorithm28 method = new Algorithm28();
        System.out.println(method.solution(10));

    }
}
