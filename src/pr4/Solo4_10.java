package pr4;

public class Solo4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        for (int i = 1; i<=5; i++){
            sum += num%10;
            num /=10;

        }
        System.out.println(sum);
    }
}
