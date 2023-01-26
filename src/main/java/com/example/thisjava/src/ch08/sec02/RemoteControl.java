package com.example.thisjava.src.ch08.sec02;

public interface RemoteControl {

    // 상수필드
    public static final int MAX_VOLUME = 10;    // interface 필드는 컴파일 과정에서 자동 상수변경.
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    void getVolume();
    
    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
