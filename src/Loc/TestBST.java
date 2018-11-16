package Loc;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(11);
        tree.insert(14);
        tree.insert(8);
        tree.insert(5);
        tree.insert(25);
        tree.insert(16);
        tree.insert(9);
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        tree.preorder();
        System.out.println("\n");
        tree.postorder();
    }
}

