package pr3;

import java.util.Scanner;

public class Solo3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        System.out.println(num-num%10 + 1);
    }
}


// 아래는 변수 num 의 값 중에서 일의 자리를 1로 바꾸는 코드이다.