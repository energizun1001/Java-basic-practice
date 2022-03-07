package pr4;

public class Solo4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        int tmp;

        for(int i = 0; i< str.length(); i++){
            sum += str.charAt(i) - '0';
            System.out.println(sum);
        }

    }
}
