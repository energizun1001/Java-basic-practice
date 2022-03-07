package ex6;
class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int a, int b){
        return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
    }
}

public class Pr6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));

    }
}
