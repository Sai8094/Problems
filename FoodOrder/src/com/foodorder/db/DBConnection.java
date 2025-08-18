package com.foodorder.db;

import java.util.HashMap;
import java.util.Map;

public class DBConnection {
    private static DBConnection instance;

    private Map<String, Object> store = new HashMap<>();

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
             instance = new DBConnection();
        }
        return instance;
    }

    public void save(String key, Object value) {
        store.put(key, value);
    }

    public Object get(String key) {
        return store.get(key);
    }
}
