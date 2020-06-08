package com.example.desiginpattern.singletonpattern;

/**
 * 饿汉式
 * 缺点：初始化创建就占用内存
 */
public class SingletonObj {

    private static SingletonObj mSingletonObj = new SingletonObj();

    private SingletonObj() {
    }

    public  SingletonObj getInstance() {
        return mSingletonObj;
    }
}


