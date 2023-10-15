package ru.savrey.lesson03;
 /**
         * Задание 4. Написать класс Калькулятор (необобщенный), который содержит статические методы:
         * sum(), multiply(), divide(), subtract().
         * Параметры этих методов - два числа разного типа, над которыми должна быть проведена операция.
  */
public class Calculator {
    public static <T extends Number, E extends Number> Double sum(T first, E second){
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number, E extends Number> Double multiply(T first, E second){
        return first.doubleValue() * second.doubleValue();
    }

     public static <T extends Number, E extends Number> Double divide(T first, E second){
         return first.doubleValue() / second.doubleValue();
     }

     public static <T extends Number, E extends Number> Double subtract(T first, E second){
         return first.doubleValue() - second.doubleValue();
     }
}
