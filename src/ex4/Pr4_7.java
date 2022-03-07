package ex4;

public class Pr4_7 {
    public static void main(String[] args){
        int value = (int)(Math.random()*6)+1;

        System.out.println(value);
    }
}

//(int) Math.random() * (최댓값-최소값+1) + 최소값