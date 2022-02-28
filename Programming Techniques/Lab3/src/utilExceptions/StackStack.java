package utilExceptions;

import java.util.Stack;

public class StackStack<T> implements StackIntfWithExceptions<T>
{
    private final Stack<T> stack;

    public StackStack() {
        this.stack = new Stack<T>();
    }

    @Override
    public void push(T o) {
        this.stack.push(o);
    }

    @Override
    public T pop() {
        T item = this.stack.pop();

        return item;
    }

    @Override
    public T peek() {
        T refItem = this.stack.peek();

        return refItem;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = this.stack.isEmpty();

        return isEmpty;
    }

    @Override
    public void clear() {
        this.stack.clear();
    }
}
