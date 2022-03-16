
package pr7;
// 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오 단, 섯다카든느 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1,3,8인 경우는 둘중의 한장은 광이어야 한다.
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for (int i = 0; i<cards.length; i++){
          int num = i%10+1;
          boolean isKwang = (i<10)&&(i == 1 || i == 3 || i == 8);
          cards[i] = new SutdaCard (num, isKwang);
        }
    }
}

class SutdaCard {
    final int NUM;
    final boolean ISKWANG;

    SutdaCard() {
        this (1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.ISKWANG = isKwang;
    }

    public String toString() {
        return NUM + (ISKWANG ? "k" : "");
    }
}

public class Solo7_14 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck ();

        for (int i = 0; i<deck.cards.length; i++){
            System.out.print (deck.cards[i] + ", ");
        }


    }
}

