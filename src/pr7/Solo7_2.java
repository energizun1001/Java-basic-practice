/*
package pr7;

import java.time.chrono.MinguoDate;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (i == 1 || i == 3 || i == 8);
            cards[i] = new SutdaCard (num, isKwang);
        }
    }

    void shuffile() {
        for (int i = 0; i<cards.length; i++){
            int j = (int)(Math.random ()*cards.length);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        }

    }

    SutdaCard pick(int index) {
        if (index<0 || index>= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random ()*cards.length);
        return pick (index);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this (1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "k" : "");
    }
}

public class Solo7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck ();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print (deck.cards[i] + ", ");
        }
    }
}
*/
