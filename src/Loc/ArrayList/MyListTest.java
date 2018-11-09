package Loc.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList elements = new MyList(10);
        elements.add(1,"Loc");
        elements.add(10,"Loc");
        elements.add(11,"Loc");
        elements.show();
        elements.size();
        System.out.println("After removing: ");
        elements.remove(12);
        elements.show();
        elements.size();
        elements.clone();
        System.out.println("Does Loc exist in this array ? "+elements.contains("Loc"));
        System.out.println("Index of the first null: "+ elements.indexOf(null));
        System.out.println("After adding");
        elements.add("Loc");
        elements.show();
        System.out.println("Value at the index "+1+" is: "+elements.get(1));
        elements.clear();
        elements.show();
        elements.ensureCapacity();
        elements.show();
    }
}
