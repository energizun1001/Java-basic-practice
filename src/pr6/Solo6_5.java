package pr6;


public class Solo6_5 {
    private static class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }


        int getTotal() {
            return kor + eng + math;
        }

        float getAverage() {
            return Math.round ((float) getTotal () / 3 * 10) / 10.0f;
        }

        String info() {
            return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal () + ", " + getAverage ();
        }
    }

    public static void main(String[] args) {
        Student s = new Student ("홍길동", 1, 1, 100, 60, 76);

        System.out.println (s.info ());

    }
}
