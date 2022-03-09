package pr6;
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return Math.round((float)getTotal()/3 *10)/10.0f;
    }
}

public class Solo6_4 {

    public static void main(String[] args) {
        Student s = new Student ();

        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor =100;
        s.eng = 60;
        s.math = 76;

        System.out.println (s.name);
        System.out.println (s.getTotal ());
        System.out.println (s.getAverage ());


    }
}
