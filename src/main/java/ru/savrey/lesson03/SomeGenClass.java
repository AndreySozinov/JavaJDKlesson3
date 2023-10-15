package ru.savrey.lesson03;
//Создать обобщенный класс с тремя параметрами (T, V, K).
//Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры
// типа (T, V, K), методы, возвращающие значения трех переменных.
//Создать метод, выводящий на консоль имена классов для трех переменных класса.
// Наложить ограничения на параметры типа:
// Т должен реализовать интерфейс Comparable (классы оболочки, String),
// V должен реализовать интерфейс DataInput и расширять класс InputStream,
// К должен расширять класс Number.

import java.io.DataInput;
import java.io.InputStream;

public class SomeGenClass <T extends Comparable, V extends InputStream & DataInput, K extends Number> {
    T first;
    V second;
    K third;

    SomeGenClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void getVarClass() {
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
        System.out.println(third.getClass().getName());
    }
}
