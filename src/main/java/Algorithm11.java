public class Algorithm11 {
    public static void main(String[] args){

        int x = 30000;
        int n = 100;
        long[] answer = new long[n];

        for (int i = 0; i<n ; i++){
            answer[i] += (long)(i+1)*x;
        }
    }
}
