public class Algorithm9 {
    public static void main(String[] args){

        String phone_number = "01033334444";
        String answer = "";

        for (int i = 0; i<phone_number.length(); i++){
            if (i < phone_number.length()-4){
                answer += "*";
            }else answer += phone_number.charAt(i);
        }

        System.out.println(answer);

        String str = "123456789";
        String answerr = "";

        for (int i = 0; i < str.length(); i++){
            if (i < str.length()-4){
                answerr = str.replace(str.substring(0,i+1),"*");
            }
        }
    }
}
