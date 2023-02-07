package Stack;

public class ArrayStack implements Pila {

    public ArrayStack() {
        this.list = new Comparable[20];
        this.itemcount = 0;
    }

    public boolean isEmpty() {
        for(int i=0; i<this.list.length; i++) {
            if (this.list[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void makeEmpty() {
        for(int i=0; i<this.list.length; i++) {
            this.list[i] = null;
        }
    }

    public void push(Object obj) {
        //if (this.itemcount >= this.list.length) this.list = resize(list, list.length*2);
        if (itemcount >= this.list.length) throw new FullStackException();
        this.list[this.itemcount] = obj;
    }

    // private Object[] resize(Object[] oldAr, int newLength)
    // {
    //     Object[] tmp = new Object[newLength];
    //     System.arraycopy(this.list, 0, tmp, 0, this.list.length);
    //     return tmp;
    // }

    public Object pop() {
        if (this.isEmpty()) throw new EmptyStackException();
        Object last = this.list[this.itemcount-1];
        this.list[this.itemcount-1] = null;
        return last;
    }

    public Object top() {
        if (this.isEmpty()) throw new EmptyStackException();
        return this.list[this.itemcount-1];
    }
    
    Object[] list;
    int itemcount;
}
