package ru.savrey.lesson03;
/**
 * Написать итератор по массиву. (Next, hasNext)
 */
import java.util.Iterator;

public class ParamIterator<T> implements Iterator<T> {

    private final ParametrizedCollection<T> collection;

    private int index = 0;

    public ParamIterator(ParametrizedCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getLength();
    }

    @Override
    public T next() {
        T result = collection.getElement(index);
        index++;
        return result;
    }
}
