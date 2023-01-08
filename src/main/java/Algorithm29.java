public class Algorithm29 {
    public int solution(int n) {
        int answer = 0;
        String three  = Integer.toString(n,3);
        String ten = "";

        for (int i = three.length()-1 ; i >= 0 ; i--){
            ten = ten + three.charAt(i);
        }

        answer = Integer.parseInt(ten, 3);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm29 algorithm29 = new Algorithm29();
        System.out.println(algorithm29.solution(125));
    }
}
