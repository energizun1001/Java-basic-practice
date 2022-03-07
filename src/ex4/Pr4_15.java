package ex4;

public class Pr4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result = 0;

        while (tmp!=0){
            int ee = number%10;
            number/=10;
            result += ee;
            if (number%10 ==0){
                break;
            }
            result *= 10;
        }
        if (number == result){
            System.out.println("g");
        }
        else
            System.out.println("f");
    }
}
