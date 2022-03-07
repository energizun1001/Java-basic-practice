package ex3;

public class Pr3_10 {
    public static void main(String[] args) {
        char ch = 'b';
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;

        System.out.println(ch);
        System.out.println(lowerCase);
    }
}

// 대문자를 소문자로 변경하는 코드
