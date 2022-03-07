package pr3;

public class Solo3_10 {
    public static void main(String[] args) {
        char ch = 'B';

        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
        System.out.println(lowerCase);
    }

}
