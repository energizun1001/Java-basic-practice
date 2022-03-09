package pr6;

public class Solo6_22 {
/*
    static boolean isNumber(String str) {
        if (str == null || str.equals ("")) {
            return false;
        }

        boolean numType = false;
        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);
            if ('1' <= ch && ch <= '9') {
                numType = true;
            } else {
                numType = false;
            }
        }
        return numType;
    }
*/

        static boolean isNumber(String str) {
            if (str == null || str.equals ("")) {
                return false;
            }
            for (int i = 0; i < str.length (); i++) {
                char ch = str.charAt (i);
                if (ch < '0' || ch > '9') {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String str = "123";
        System.out.println (str + "는 숫자입니까?" + isNumber (str));

        str = "1234o";
        System.out.println (str + "는 숫자입니까?" + isNumber (str));
    }
}
