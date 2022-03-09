class DeckTest {
    public static void main(String args[]) {
        Deck d = new Deck();	   // 카드 한 벌(Deck)을 만든다.
        // 연산자 new 에 의해서 메모리에 Deck 클래스의 인스턴스가 생성된다. @@
        // 생성자 Deck()이 호출되어 수행된다. @@
        // 연산자 new 의 결과로 생성된 Deck 인스턴스의 주소가 반환되어 참조변수 d 에 저장된다. @@
        Card c = d.pick(0);	   // 섞기 전에 제일 위의 카드를 뽑는다.
        // 참조변수 d안에 메소드 pick(0)을 호출한다음 @@
        // Card 클래스 타입의 참조변수 c에 저장한다. @@

        System.out.println(c); // System.out.println(c.toString());과 같다.

        d.shuffle();			   // 카드를 섞는다.
        // 참조변수 d의 메소드 shuffle 호출 @@
        c = d.pick(0);		   // 섞은 후에 제일 위의 카드를 뽑는다.
        // 참조변수 c 에 참조변수 d 의 메소드 pick(0)의 결과값 저장 @@
        System.out.println(c);
    }
}

// Deck클래스
class Deck {
    final int CARD_NUM = 52;	// 카드의 개수
    // 정수타입 상수 CARD_NUM 선언 @@
    Card cardArr[] = new Card[CARD_NUM];  // Card 객체 배열을 포함
    // 연산자 new 에 의해서 메모리에 Card 클래스의 인스턴스가 생성된다. @@
    // 생성자 Card[Card_NUM]이 호출되어 수행된다. @@
    // 연산자 new 의 결과로 생성된 Card 인스턴스의 주소가 반환되어 참조변수 cardArr[] 에 저장된다. @@

    Deck () {	// Deck의 카드를 초기화한다.
        int i=0;


        for(int k=Card.KIND_MAX; k > 0; k--)
            //k 4 -> 3 -> 2 -> 1로 수행 총 4번 @@
            for(int n=0; n < Card.NUM_MAX ; n++)
                //n 0 -> ,,, -> 12로 수행 총 13번 @@
                cardArr[i++] = new Card(k, n+1);
            // cardArr[길이 = 52] @@
    }

    Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }

    Card pick() {			// Deck에서 카드 하나를 선택한다.
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() { // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck클래스의 끝

// Card클래스
class Card {
    static final int KIND_MAX = 4;	// 카드 무늬의 수
    static final int NUM_MAX  = 13;	// 무늬별 카드 수

    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    } // toString()의 끝
} // Card클래스의 끝
