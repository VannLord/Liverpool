package Loc;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){}
    public BST(E[] es){
        for (int i = 0; i < es.length ; i++) {
            insert(es[i]);
        }
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    public boolean contain(E e){
        TreeNode<E> current = root;
        while(current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                if (e.compareTo(current.element) > 0) {
                    current = current.right;
                } else return true;
            }
        }
        return false;
    }
    @Override
    public boolean insert(E e) {
    if(root == null) root = createNewNode(e);
    else{
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while(current != null){
            if(e.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            }
            else{if(e.compareTo(current.element)>0){
                parent = current;
                current = current.right;
            }
            else return false;
            }
        }
        if(e.compareTo(parent.element) < 0){
            parent.left = createNewNode(e);
        }
        else parent.right = createNewNode(e);
    }
    size++;
    return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    public void preorder(){
        preorder(root);
    }
    protected void preorder(TreeNode<E> root){
        if(root == null ) return;
        System.out.print(root.element+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(){
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if(root == null ) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }

}
