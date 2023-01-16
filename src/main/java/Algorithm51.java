import java.util.Arrays;

public class Algorithm51 {
    public String[] mySolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = "0".repeat(n - binary.length()) + binary;
            answer[i] = binary.replaceAll("1", "#").replaceAll("0", " ");
        }

        return answer;
    }

    public String[] bestSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++){
            answer[i] = String.format("%" + n + "S", answer[i]);
            answer[i] = answer[i].replace("1","#");
            answer[i] = answer[i].replace("0", " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm51 algorithm51 = new Algorithm51();
        int[] arr1 = {46,33,33,22,31,50};
        int[] arr2 = {27,56,19,14,14,10};

        System.out.println(Arrays.toString(algorithm51.mySolution(6, arr1, arr2)));
    }
}
