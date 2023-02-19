package Queue;

public class ArrayQueue implements Queue{

    public ArrayQueue() {
        this.list = new Object[1];
        this.itemCount = 0;
    }

    public boolean isEmpty() {
        for (int i=0; i<this.list.length; i++) {
            if (this.list[i] != null) return false;
        }
        return true;
    }

    public void makeEmpty() {
        for (int i=0; i<this.list.length; i++) {
            this.list = null;
        }
        
    }

    public void enqueue(Object obj) {
        if (this.itemCount == this.list.length)
        {
            Object[] tmp = new Object[list.length];
            System.arraycopy(this.list, 0, tmp, 0, this.itemCount);
            this.list = new Object[this.list.length*2];
            System.arraycopy(tmp, 0, this.list, 0, this.itemCount);
        }
        this.list[this.itemCount] = obj;
        this.itemCount++;
        
    }

    public Object dequeue() {
        Object out = this.list[0];
        this.list[0] = null;
        for (int i=1; i<this.itemCount; i++) {
            this.list[i] = this.list[i+1];
        }
        this.itemCount--;
        return out;
    }

    public Object getFront() {
        return this.list[0];
    }
    
    Object[] list;
    int itemCount;
}
