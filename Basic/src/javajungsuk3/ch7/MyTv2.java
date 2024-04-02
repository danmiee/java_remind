package javajungsuk3.ch7;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    /* (1) 알맞은 코드를 넣어 완성하시오. */

    public boolean getPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.prevChannel = getChannel();
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*
    메서드명 : gotoPrevChannel
    기    능 : 현재 채널을 이전 채널로 변경한다.
    반환타입 : 없음
    매개변수 : 없음
    */
    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
