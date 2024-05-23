package dynamic_beat_8;


public class 실행순서 {

    // 인스턴스 변수 선언 및 초기화
    private int instanceVariable = initializeInstanceVariable();
    private static int staticVariable = initializeStaticVariable();

    // 정적 초기화 블록 (클래스가 실행될 떄 딱 한번만 실행)
    static {
        System.out.println("Static initialization block");
    }

    // 인스턴스 초기화 블록 (객체가 생성될 떄마다 실행)
    {
        System.out.println("Instance initialization block");
    }

    // 생성자
    public 실행순서() {
        System.out.println("Constructor");
    }

    // 정적 메소드
    private static int initializeStaticVariable() {
        System.out.println("Static variable initialization");
        return 1;
    }
    // 인스턴스 메소드 
    private int initializeInstanceVariable() {
        System.out.println("Instance variable initialization");
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        실행순서 example = new 실행순서();
        System.out.println("Main method ends");

  
    }
}
