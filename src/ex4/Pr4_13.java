package ex4;

public class Pr4_13 {
    public static void main(String[] args) {
        String value = "1234";
        char ch = ' ';
        boolean isNumber = true;

        for (int i =0; i<value.length(); i++){
            ch = value.charAt(i);

            if (!('0'<= ch && ch <= '9')){
                isNumber =false;
                break;
            }
        }

        if (isNumber) {
            System.out.println("good");
        }
        else
            System.out.println("Fuck");
    }
}
