package Stack;

public interface Pila extends Container
{
   void push(Object obj);
   Object pop();
   Object top();
}

class EmptyStackException extends RuntimeException {  }
class FullStackException extends RuntimeException  {  }