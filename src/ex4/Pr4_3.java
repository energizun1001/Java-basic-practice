package ex4;

public class Pr4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for (int i=1; i<=10; i++){
            sum = sum + i;
            total = total + sum;
        }
        System.out.println(total);
    }
}
