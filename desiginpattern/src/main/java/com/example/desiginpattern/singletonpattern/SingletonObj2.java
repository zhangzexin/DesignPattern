package com.example.desiginpattern.singletonpattern;

/**
 * 懒汉式
 * 缺点：不是线程安全
 */
public class SingletonObj2 {
    private static SingletonObj2 mSingletonObj2;

    private SingletonObj2() {

    }

    public SingletonObj2 getInstance() {
        if (mSingletonObj2 == null) {
            mSingletonObj2 = new SingletonObj2();
        }
        return mSingletonObj2;
    }
}
