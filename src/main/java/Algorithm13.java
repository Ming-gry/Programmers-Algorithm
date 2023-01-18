public class Algorithm13 {
    public static void main(String[] args) {
        String answer = "";
        int month = 0;
        int a = 12;
        int b = 31;
        int[] monthList = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"THU", "FRI","SAT","SUN", "MON", "TUE", "WED"};

        for (int i = 0; i < a-1; i++) {
            month += monthList[i];
        }

        int today = (month + b);
        today %=7;
        answer = day[today];

        System.out.println(answer);


    }
}
