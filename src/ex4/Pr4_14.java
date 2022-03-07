package ex4;

import java.util.Scanner;

public class Pr4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int cnt = 0;

        do {
            cnt++;
            System.out.print("입력");
            input = sc.nextInt();

            if (answer > input){
                System.out.println("크다");
            }
            else if (answer< input){
                System.out.println("작아");
            }
            else {
                System.out.println("정답 시도횟수 :" + cnt);
                break;
            }
        } while (true);

    }
}
