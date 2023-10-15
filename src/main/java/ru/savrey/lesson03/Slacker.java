package ru.savrey.lesson03;

public class Slacker implements Person{
    private final String name;

    public Slacker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doWork() {
        System.out.printf("%s asking 'What is work?'\n", this.name);
    }

    @Override
    public void haveRest() {
        System.out.printf("%s resting\n", this.name);
    }
}
