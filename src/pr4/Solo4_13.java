package pr4;

public class Solo4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for (int i =0 ; i<value.length(); i++){
            ch = value.charAt(i);
            if (!('1'<= ch && ch <= '9')){
                isNumber = false;
                break;
            }

        }
        if (isNumber){
            System.out.println("숫자");
        }
        else {
            System.out.println("Nope");
        }
    }
}
