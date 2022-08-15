package chapter6;

/*
 INSTANTIATING OBJECTS:
 Write a class that creates instances of the Rectangle class  to find
 the total area of 2 rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args) {

        /***********
         RECTANGLE 1
         **********/
        // Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(8);
        room1.setWidth(5);
        double areaOfRoom1 = room1.calculateArea();

        /***********
         RECTANGLE 2
         **********/
        // Create instance of Rectangle class
        Rectangle room2 = new Rectangle(10, 8);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
