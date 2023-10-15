package ru.savrey.lesson03;

import java.util.Iterator;

/**
 * Описать собственную коллекцию - список на основе массива.
 * Коллекция должна иметь возможность хранить любые типы данных,
 * иметь методы добавления и удаления элементов.
 */
public class ParametrizedCollection<T> implements Iterable<T>{
    private T[] arr;
    private int index = 0;

    public ParametrizedCollection(T[] arr) {
        this.arr = arr;
    }

    public void addElement(T element) {
        if (index < arr.length) {
            arr[index] = element;
            index++;
        } else throw new RuntimeException("Collection is full.");
    }

    public void delElement(T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) { arr[i] = null; }
        }
    }

    public int getLength() {
        return arr.length;
    }

    public T getElement(int index) {
        return arr[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<>(this);
    }
}
