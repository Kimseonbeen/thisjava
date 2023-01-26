package com.example.thisjava.src.ch01.sec06;

public class Korean {

    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Korean{" +
                "nation='" + nation + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
