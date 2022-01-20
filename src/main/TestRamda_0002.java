package main;

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
}

public class TestRamda_0002 {
    public static void main(String[] args) {

        Person rin = new Person();

        /*람다*/

        rin.hi((a, b) -> {
            System.out.println("t1");
            System.out.println("a = " + a + ", b = " + b);
            return 7;
        });

    }
}
