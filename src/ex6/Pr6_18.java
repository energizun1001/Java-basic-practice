package ex6;

class Data {
    String str;
}

public class Pr6_18 {
    String change(String str){
        return str+="456";
    }
    public static void main(String[] args) {
        Pr6_18 d = new Pr6_18();
        String str = "ABC123";
        System.out.println(str);
        String str2 = d.change(str);
        System.out.println(str2);




    }

}

