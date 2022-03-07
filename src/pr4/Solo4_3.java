package pr4;

public class Solo4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int tmp = 0;
        for (int i = 1; i<=10; i++){
            sum = sum + i;
            tmp = tmp+sum;
        }
        System.out.println(tmp);
    }
}
