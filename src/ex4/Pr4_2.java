package ex4;

public class Pr4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x=1; x<=20; x++){
            if (x%2!=0){
                if (x%3 !=0){
                   sum = sum + x;
                }
            }
        }
        System.out.println(sum);

    }
}
