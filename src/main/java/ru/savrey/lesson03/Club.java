package ru.savrey.lesson03;

import java.util.Iterator;

public class Club<T extends Person> implements Iterable {
    private T[] arr;

    public Club(T[] arr) {
        this.arr = arr;
    }

    public void resting(int index){
        arr[index].haveRest();
    }

    public void allResting(){
        for (T el : arr) {
            el.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ClubIterator<T>();
    }

    /**
     * Внутренний класс-итератор
     * @param <T> Объект коллекции, расширяющий класс Person
     */
    class ClubIterator<T extends Person> implements Iterator<T> {

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
