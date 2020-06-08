package com.example.desiginpattern.singletonpattern;

/**
 * 安全懒汉式
 */
public class SingletonObj3 {

    private static SingletonObj3 mSingletonObj3;


    public SingletonObj3() {
    }

    public synchronized SingletonObj3 getInstance(){
        if (mSingletonObj3 == null) {
            mSingletonObj3 = new SingletonObj3();
        }
        return mSingletonObj3;
    }
}
