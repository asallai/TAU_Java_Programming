package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }

    public void print(String text) {
        System.out.println("I am a " + text);
    }
}
