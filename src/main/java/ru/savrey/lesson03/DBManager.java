package ru.savrey.lesson03;

public class DBManager implements DataBaseWorker{

    private final String[] database;

    private int index;

    public DBManager(String[] database) {
        this.database = database;
        index = 0;
    }

    @Override
    public boolean insertEntry(String entry) {
        if (index < database.length) {
            database[index] = entry;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEntry(int id) {
        if (id < database.length && database[id] != null) {
            database[id] = null;
            return true;
        }
        return false;
    }


    @Override
    public String getEntry(int id) {
        if (id < database.length) {
            return database[id];
        }
        return null;
    }

}
