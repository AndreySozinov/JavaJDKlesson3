package ru.savrey.lesson03;

public class Pair<T, E> {
    private T first;
    private E second;

    /**
     * Обобщенный класс, содержащий две переменные разных типов.
     * @param first  Переменная одного типа.
     * @param second Переменная второго типа.
     */
    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
