package main;

import java.sql.SQLOutput;

// 함수가 1개만 존재하는 인터페이스
@FunctionalInterface
interface Say{
    int ir1(int a, int b);

}

class Person{
    public void hi(Say line){
        int number = line.ir1(3, 4);
        System.out.println("num is ==> " + number);
    }

    public void hi2(Say line){
        int number = line.ir1(3, 4);
        System.out.println("num2 is ==> " + number);
    }
}






public class TestRamda_0002 {
    public static void main(String[] args) {

        Person rin = new Person();

        /*람다*/

        rin.hi((a, b) -> {
            System.out.println("t1");
            System.out.println("a = " + a + ", b = " + b);
            return a+b;
        });

        Person rin2 = new Person();

        rin2.hi2((a, b) -> {
            System.out.println("t2");
            System.out.println("a = " + a + ", b = " + b);
            return a*b;
        });

    }
}



