package utilExceptions;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ListStack<T> implements StackIntfWithExceptions<T>
{
    private final ArrayList<T> arrayList;

    public ListStack() {
        this.arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T o) {
        arrayList.add(o);
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        int index = this.arrayList.size() - 1;

        T item = this.arrayList.remove(index);

        return item;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        int index = this.arrayList.size() - 1;

        T refItem = this.arrayList.get(index);

        return refItem;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;

        if (this.arrayList.size() == 0) {
            isEmpty = true;
        }

        return isEmpty;
    }

    @Override
    public void clear() {
        this.arrayList.clear();
    }
}
