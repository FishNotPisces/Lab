package Stack;

public class Ordinamento {
    public static void sort(ArrayStack stack) {
        if (!(stack instanceof Comparable)) throw new IllegalArgumentException();
        ArrayStack holder = new ArrayStack();
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            while (!stack.isEmpty()) {
                holder.push(stack.pop());
            }
            Comparable item;
            while (!holder.isEmpty()) {
                item = (Comparable)holder.pop();
                stack.push( (holder.isEmpty() || item.compareTo(holder.top()) < 0) ? item : holder.pop() );
                if (!(holder.isEmpty() || item.compareTo(holder.top()) < 0)) isSorted = false;
            }
        }
    }
}
