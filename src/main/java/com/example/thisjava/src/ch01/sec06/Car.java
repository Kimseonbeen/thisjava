package com.example.thisjava.src.ch01.sec06;

public class Car {

    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car (String model) {
        this(model, "은색", 250);
    }

    Car (String model, String color) {
        this(model, color, 250);
    }

    Car (String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
