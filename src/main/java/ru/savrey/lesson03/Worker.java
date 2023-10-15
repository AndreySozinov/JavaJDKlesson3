package ru.savrey.lesson03;

public class Worker implements Person{
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doWork() {
        System.out.printf("%s is working\n", this.name);
    }

    @Override
    public void haveRest() {
        System.out.printf("%s asking 'What is rest?'\n", this.name);
    }
}
