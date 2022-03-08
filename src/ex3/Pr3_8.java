package ex3;

public class Pr3_8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        byte c = (byte)(byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3/2f;
        long l = 3000 * 3000 * 3000L;

        float f2 = 0.1f;
        double d = 0.1;


        boolean result = (float)d == f2;

        System.out.println(c);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(l);
        System.out.println(result);
    }
}
