package pr6;

public class Solo6_24 {
    static int abs(int value){
    /*    if (value>=0){
            return value;
        }
        return -value;*/
        return value >= 0? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println (abs (value));
        value = -10;
        System.out.println (abs (value));
    }
}
