package ru.savrey.lesson03;

public interface DataBaseWorker {

    boolean insertEntry(String entry);

    boolean deleteEntry(int id);
    String getEntry(int id);
}
