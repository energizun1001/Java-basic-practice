package pr4;

public class Solo4_15 {
    public static void main(String[] args) {
        int number = 12341;
        int tmp = number; // 12321

        int result = 0;

        while (tmp !=0){
            result =  result*10 + tmp%10; // tmp = 1
            tmp/=10;

        }
        if (number == result) {
            System.out.println("화문수");
        }
        else {
            System.out.println("아녀유");
        }
    }
}
