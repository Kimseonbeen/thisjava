package com.example.thisjava.src.ch11.sec04;

public class MyResource implements AutoCloseable{

    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[My Resource(" + name + ") 열기]");
    }

    public String read1() {
        System.out.println("[My Resource(" + this.name + ") 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[My Resource(" + this.name + ") 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[My Resource(" + this.name + ") 닫기]");
    }
}
