package ex6;
class Student {
    String name;
    int ban, no, kor, eng, math;

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int)(getTotal()/3f * 10 + 0.5f)/10f;
    }
}
public class Pr6_3 {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());

    }
}
