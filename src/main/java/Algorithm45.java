import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithm45 {
    public int[] mySolution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){
            List<Integer> integerList = new ArrayList<>();

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++){
                integerList.add(array[j]);
            }

            integerList.sort(Comparator.naturalOrder());
            answer[i] = integerList.get(commands[i][2] - 1);
        }

        return answer;
    }

    public int[] bestSolution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm45 algorithm45 = new Algorithm45();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(Arrays.toString(algorithm45.mySolution(array, commands)));
    }
}
