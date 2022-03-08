package ex5;

public class Pr5_7 {
    public static void main(String[] args) {

        int money = 3510;

        System.out.println(money);

        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        for (int i = 0; i<coinUnit.length; i++){
            int coinNum = 0;

            coinNum = money/coinUnit[i];

            if (coin[i] >= coinNum){
                coin[i] -= coinNum;
            }
            else {
                coinNum = coin[i];
                coin[i] = 0;
            }

            money -= coinNum*coinUnit[i];

            System.out.println(coinUnit[i] + "원 : " + coinNum);
        }

        if (money>0){
            System.out.println("부족");
            System.exit(0);
        }

        System.out.println("남은 동전의 개수");

        for (int i = 0; i<coinUnit.length; i++){
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }
}
