public class Algorithm27 {
    public long solution(long num) {
        long answer = 0;

        while (num>0){
            if (num == 1||answer>=500){
                break;
            } else if (num%2==0){
                num/=2;
                answer++;
            } else if (num%2==1) {
                num =(num*3)+1;
                answer++;
            }
        }

        if (answer >= 500){
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm27 method = new Algorithm27();
        System.out.println(method.solution(6));
    }
}
