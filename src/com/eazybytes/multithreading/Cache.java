package com.eazybytes.multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Cache {
    private final Map<String,String> data = new HashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public String getData(String key){
        lock.readLock().lock();
        try{
            return data.get(key);
        }finally {
            lock.readLock().unlock();
        }

    }

    void putData(String key, String value){
        lock.writeLock().lock();
        try {
            data.put(key, value);
        }finally {
            lock.writeLock().unlock();
        }

    }
}
