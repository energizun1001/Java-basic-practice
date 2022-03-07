package ex6;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {//isPowerOn의 값이 true면 false로, false면 ture로 바꾼다.
        if (isPowerOn == false) {
            isPowerOn = true;
        } else
            isPowerOn = false;
    }

    void volumeUP() {//volume의 값이 MAX_v보다 작을떄 값을 1증가
        if (volume < MAX_VOLUME) {
            volume += 1;
        }
    }

    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume -= 1;
        }
    }

    void channelUP() {
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else
            channel += 1;
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else
            channel -= 1;
    }
}


public class Pr6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println(t.channel + " " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println(t.channel + " " + t.volume);

        t.volume = 100;
        t.channelUP();
        t.volumeUP();
        System.out.println(t.channel + " " + t.volume);

    }
}
