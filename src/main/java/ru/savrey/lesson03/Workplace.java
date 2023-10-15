package ru.savrey.lesson03;

import java.util.Iterator;

public class Workplace<T extends Person> implements Iterable{
    private T[] arr;

    public Workplace(T[] arr) {
        this.arr = arr;
    }

    public void working(int index){
        arr[index].doWork();
    }

    public void allWorking(){
        for (T el : arr) {
            el.doWork();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new WorkplaceIterator<T>();
    }

    /**
     * Внутренний класс-итератор
     * @param <T> Объект коллекции, расширяющий класс Person
     */
    class WorkplaceIterator<T extends Person> implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public T next() {
            T result = (T)arr[index];
            index++;
            return result;
        }
    }
}
