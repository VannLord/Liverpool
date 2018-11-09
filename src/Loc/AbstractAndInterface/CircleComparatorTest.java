package Loc.AbstractAndInterface;

import Loc.AccessModifier.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"yellow");
        System.out.println("Pre=sorted: ");
        for (Circle circle:circles
             ) {
            System.out.println(circle);

        }
        Comparator cirlceComparator = new CircleComparator();
        Arrays.sort(circles, cirlceComparator);
        System.out.println("After-sorted: ");
        for (Circle circle:circles
             ) {
            System.out.println(circle);

        }
    }
    public static void sort ( Object[] objects,Comparator comparator){
        Object brigdes;
        for (int i = 0; i < objects.length-1 ; i++) {
            for (int j = 1; j < objects.length  ; j++) {
                if(comparator.compare(objects[i],objects[j])==1){
                    brigdes = objects[i];
                    objects[i] = objects [j];
                    objects[j] = brigdes;
                }


            }

        }


    }
}
