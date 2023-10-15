package ru.savrey.lesson03;
/**
 * Задание 2. Описать интерфейс Person с методами doWork() и haveRest().
 * Написать два класса - Работник и Бездельник, реализующих интерфейс.
 * Работник работает и не умеет бездельничать, бездельник - не умеет работать, но умеет отдыхать.
 * Написать обобщенные классы Workplace и Club, содержащие массив из Person.
 * В классах необходимо вызывать у всего массива Person соответствующие методы.
 *
 * Задание 3. Внедрить итератор из задания 2 в коллекцию, так чтообы итератор был внутренним классом
 * и, соответственно, объектом в коллекции.
 *
 * Задание 5. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false если нет.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
 * элементы одного типа.
 *
 * Задание 6. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
 * а также переопределение методв toString(), возвращающее строковое представление пары.
 *
 * TODO:
 * HomeWork
 * Создайте интерфейс, который определяет набор методов для работы с базой данных
 * (например, сохранение, удаление, получение данных).
 * Реализуйте этот интерфейс в конкретном классе.
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        InputStream is = new DataInputStream(new FileInputStream("text.txt"));
//        SomeGenClass<String, DataInputStream, Integer> sgc = new SomeGenClass<>("some string",
//                new DataInputStream(is), 42);
//        sgc.getVarClass();

        // Задание 2.
        Person[] people = {
                new Worker("Vasya"),
                new Worker("Petya"),
                new Worker("Liza"),
                new Slacker("Stella"),
                new Slacker("Cristoff"),
                new Slacker("Gregour"),
                new Worker("Osip"),
                new Slacker("Alex")
        };

        Workplace<? extends Person> factory = new Workplace<>(people);
        Club<? extends Person> nightClub = new Club<>(people);

        factory.allWorking();
        nightClub.allResting();

        // Задание 3.
        for (Iterator<? extends Person> it = factory.iterator(); it.hasNext(); ) {
            Person person = it.next();
            System.out.println(person.getClass().getSimpleName() + " " + person.getName());
        }
    }

    // Задание 5.
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) return false;
        }
        return true;
    }
}
