package com.animatedguide.generics.keyvalue;

public class KeyValue<K,V> implements Pair<K,V>{

    private final K key;
    private final V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
