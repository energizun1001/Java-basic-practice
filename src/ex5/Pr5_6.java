package ex5;

public class Pr5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500,100,50,10};

        int money = 2680;
        System.out.println(money);

        for (int i = 0; i<coinUnit.length; i++){
            System.out.println(money/coinUnit[i]);
            money = money%coinUnit[i];

        }
    }
}
