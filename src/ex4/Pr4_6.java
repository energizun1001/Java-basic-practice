package ex4;

public class Pr4_6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=6; j++){
                sum = i + j;
                if (sum == 6){
                    System.out.println(i + " + " + j +" = " + sum);
                }
                sum = 0;
            }
        }
    }
}
//두개의 주사위를 던졌을때 눈의 합이 6이 되는 모든 경우의수를 출력
