package dynamic_beat_4;

public class test extends test2 {

    @Override
    void sayHello() {
        System.out.println("123123");

    }

    public static void main(String[] args) {
        test b = new test();
        b.sayHello(); // 1. extends 이용한 overriding

        test2 a = new test2();
        a.sayHello();

        test2 aa = new test2() {
            @Override
            void sayHello() {
                System.out.println("야후");
            }
        };
        aa.sayHello(); // 2. overriding 하여 인스턴스를 생성
    }
}
