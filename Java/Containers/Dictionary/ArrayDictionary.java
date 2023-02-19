package Dictionary;

public class ArrayDictionary implements Dictionary{

    public boolean isEmpty() {
        for (int i = 0; i < this.elements.length; i++) {
            if (elements[i] != null) return false;
        }
        return true;
    }

    public void makeEmpty() {
        for (int i = 0; i < this.elements.length; i++) {
            elements[i] = null;
        }    
    }

    public void insert(Comparable key, Object value) {
        // TODO Auto-generated method stub
        
    }

    public void remove(Comparable key) {
        // TODO Auto-generated method stub
        
    }

    public Object find(Comparable key) {
        for (int i = 0; i < this.elemCount; i++) {
            // TODO Auto-generated method stub
        }
        return null;
    }
    
    protected Pair[] elements;
    protected int elemCount; 

    protected class Pair {
        public Pair(Comparable key, Object value) {
            setKey(key);
            setValue(value);
        }

        public void setKey(Comparable key) {
            this.key = key;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Comparable getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        Comparable key;
        Object value;
    }
}
