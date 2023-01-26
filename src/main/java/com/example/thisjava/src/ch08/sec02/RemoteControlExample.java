package com.example.thisjava.src.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(11);
        rc.getVolume();
        rc.setMute(false);
        rc.setMute(true);
        rc.setMute(false);

        RemoteControl.changeBattery();

    }
}
