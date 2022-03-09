package pr6;
// 인스턴스변수 : kind, num
// 클래스 변수 : width, height
// 지역변수 : k, n, args, card
class PlayingCard{
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n){
        kind = k;
        num = n;
    }
}

public class Solo6_8 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard (1,1);

    }
}
