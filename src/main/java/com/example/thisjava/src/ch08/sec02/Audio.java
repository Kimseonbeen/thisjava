package com.example.thisjava.src.ch08.sec02;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("오디오를켰네");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를껐네");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            volume = RemoteControl.MIN_VOLUME;
        } else {
            volume = volume;
        }
        System.out.println("현재 볼륨 : " + volume);
    }

    @Override
    public void getVolume() {

    }
}
