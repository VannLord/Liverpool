package Loc.ArrayList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("Loc");
        myLinkedList.add(1,"Lord");
        myLinkedList.show();
        myLinkedList.addLast("K");
        myLinkedList.show();
    }


}
