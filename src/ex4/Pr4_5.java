package ex4;

public class Pr4_5 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10){
            int j = 0;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        /*int i = 0;
        int j = 1;
        while (true) {
            System.out.print("*");
            i++;
            if (i == j) {
                System.out.println();
                if (i == 10){
                    break;
                }
                i = 0;
                j++;
            }
        }*/
    }
}


/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 */