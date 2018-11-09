package Loc.StackAndQueue;

public class MyStack {
    int size;
    int[] array;
    int index = 0;
    public MyStack(int size){
        this.size = size;
        this.array = new int[size];
    }
    public void push(int i){
        if(index == size) System.out.println("The array is full !!");
        else{
            array[index++] = i;
        }
    }
    public int pop(){
        if(index == 0) System.out.println("Nothing to pop !!!");
        else {
             return array[--index];
        }
        return Integer.parseInt(null);
    }
    public boolean isEmpty(){
        if(index == 0) return true;
        return false;
    }
    public boolean isFull(){
        if(index == size) return true;
        return false;
    }
    public int size(){
        return size;
    }
    public void reverse(){
        if(index == 0) System.out.println("Nothing to reverse !!");
        else {
            int[] array1 = new int[index];
            for (int i = 0; i < index; i++) {
                array1[i] = array[index - i -1];
            }
            array = array1;
        }
    }

}
