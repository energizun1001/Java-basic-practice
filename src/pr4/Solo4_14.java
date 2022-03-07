package pr4;

import java.util.Scanner;

public class Solo4_14 {
    public static void main(String[] args) {
        int answer =  (int)(Math.random()*100) +1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100 사이의 값을 입력하세요 : ");
            input = sc.nextInt();

            if (answer < input){
                System.out.println("더 작은 수");
            }
            else if (answer > input){
                System.out.println("더 큰 수");
            }
            else {
                System.out.println("시도 횟수" + count + " 정답 :" + answer);
                break;
            }

        }while (true);
    }
}
