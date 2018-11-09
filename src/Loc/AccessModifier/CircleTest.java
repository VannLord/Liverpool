package Loc.AccessModifier;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"yellow");
        Cylinder cylinder = new Cylinder(5,3,"Yellow");
        System.out.println(circle);
        System.out.println(cylinder);
        circle.toString();
        cylinder.toString();


    }
}
