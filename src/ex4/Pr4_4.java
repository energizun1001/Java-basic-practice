package ex4;

public class Pr4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        while (true) {
            if (num%2 !=0){
                sum += num;
            }
            else
                sum -= num;
            if (sum >= 100){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
