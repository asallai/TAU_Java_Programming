package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        // Test - Chain of Inheritance
        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testInheritance(){
        Employee employee = new Employee();
        employee.setName("Angie");
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(3);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(5);
        System.out.println(square.calculatePerimeter());

    }

    public static void testOverload() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
        square.print("square");
    }
}
