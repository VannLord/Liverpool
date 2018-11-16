package Loc;

public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public void inorder() {
    }

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
