package Hometasks.task4;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.printArea();
        rectangle.printRectangleKind();
        System.out.println();
        Rectangle square = new Rectangle(3);
        square.printArea();
        square.printRectangleKind();
        System.out.println();
        Rectangle rectangle1 = new Rectangle(5, 6);
        rectangle1.printArea();
        rectangle1.printRectangleKind();
        System.out.println();

        boolean g = rectangle.isTheSameRectangle(square);
        System.out.println("Равенство прямоугольников - " + g);
    }
}