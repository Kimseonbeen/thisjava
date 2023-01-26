package com.example.thisjava.src.ch08.sec02;

public class Television implements RemoteControl {

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("티비를켰어");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 껐어");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }

    @Override
    public void getVolume() {
        System.out.println("get : " + volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
            if (this.memoryVolume == 0 ) {
                this.memoryVolume = this.volume;
            } else {
                setVolume(this.memoryVolume);
            }
        }
        System.out.println("해제 볼륨 : " + this.memoryVolume);
    }
}
