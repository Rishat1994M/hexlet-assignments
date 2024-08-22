package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> dictionaryMap;

    public InMemoryKV(Map<String, String> initialData) {
        this.dictionaryMap = new HashMap<>(initialData);
    }

    @Override
    public void set(String key, String value) {
        dictionaryMap.put(key, value);
    }

    @Override
    public void unset(String key) {
        dictionaryMap.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return dictionaryMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dictionaryMap);
    }

}
// END
