public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Circle Circumference: " + String.format("%.2f", circle.calculateCircumference()));

        System.out.println("---------------------------------");

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle Height: " + rectangle.getHeight());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Area: " + String.format("%.2f", rectangle.calculateArea()));
        System.out.println("Rectangle Circumference: " + String.format("%.2f", rectangle.calculateCircumference()));
        System.out.println("---------------------------------");

        Triangle triangle = new Triangle(5, 5);
        System.out.println("Triangle Height: " + triangle.getHeight());
        System.out.println("Triangle Base: " + triangle.getBase());
        System.out.println("Triangle Area: " + String.format("%.2f", triangle.calculateArea()));
        System.out.println("Triangle Circumference: " + String.format("%.2f", triangle.calculateCircumference()));
    }
}


