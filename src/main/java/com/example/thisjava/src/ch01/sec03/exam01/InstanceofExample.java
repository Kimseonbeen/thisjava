package com.example.thisjava.src.ch01.sec03.exam01;

public class InstanceofExample {

    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }

        // STOPSHIP: 2023-01-09 ?
        // TODO: 2023-01-09 dddd
        // FIXME: 2023-01-09 dsddd

    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Student p2 = new Student("김길동", 10);
        personInfo(p2);

    }
}
