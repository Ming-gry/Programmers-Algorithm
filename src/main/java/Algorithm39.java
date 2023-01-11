public class Algorithm39 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)){
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }

            answer.append(ch);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Algorithm39 algorithm39 = new Algorithm39();

        System.out.println(algorithm39.solution("AB", 1));
    }
}
