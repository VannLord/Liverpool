package Loc;

public class SearchingInBST {


    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(11);
        bst.insert(1);
        bst.insert(10);
        bst.insert(7);
        bst.insert(4);
        bst.insert(9);
        System.out.println(bst);
        System.out.println("Does it contain 4 ? "+bst.contain(8));



    }
}
