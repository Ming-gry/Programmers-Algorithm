public class Algorithm12 {
    public static void main(String[] args) {
        int price = 3;
        long money = 20;
        int count = 4;
        long answer = -1;

        for (int i = 0; i < count; i++) {
            money -= (i + 1) * price;
        } answer = (money < 0) ? -1 * money : 0;

        System.out.println(answer);
    }
}
