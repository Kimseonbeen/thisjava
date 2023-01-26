package com.example.thisjava.src.ch12.sec12;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        System.out.println("declaredMethods : " + declaredMethods);

        for (Method method : declaredMethods) {

            System.out.println("method : " + method);

            //PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation
                    (PrintAnnotation.class);

            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotation);
            
            // 메소드 호출
            method.invoke(new Service());

            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotation);


        }
    }

    private static void printLine(PrintAnnotation printAnnotation) {

        if (printAnnotation != null) {

            // number 속성값 얻기
            int number = printAnnotation.number();

            for (int i = 0; i < number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();

        }
    }
}
