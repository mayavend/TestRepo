package Test;

public class Robot {

    void speak() {
        System.out.println("Hi, I is a Robot");
    }

    public static void main(String[] args) {
//        speak();
        Robot siri = new Robot();
        siri.speak();
    }
}
