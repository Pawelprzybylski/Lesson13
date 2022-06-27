package Lesson9.Task1;

import java.util.HashMap;

public class Map implements OwnMap {

    HashMap<String, String> map = new HashMap<>();

    @Override
    public void put(String key, String value) {
        map.put(key, value);

    }

    @Override
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public String remove(String key) {
        return map.remove(key);
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

}
