package com.example.desiginpattern.singletonpattern;

/**
 * 双校验安全锁
 */
public class SingletonObj4 {

    private SingletonObj4() {

    }

    private static SingletonObj4 singletonObj4;

    public SingletonObj4 getInstance() {
            if (singletonObj4 == null) {
                synchronized (SingletonObj4.class) {
                    if (singletonObj4 == null) {
                        singletonObj4 = new SingletonObj4();
                    }
                }
            }
        return singletonObj4;
    }
}
