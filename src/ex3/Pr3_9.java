package ex3;

public class Pr3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') ||('1' <= ch && ch <= '9');

        System.out.println(b);
    }
}

// ch가 영문자이거나 숫자일 때만 변수 b 의 값이 true