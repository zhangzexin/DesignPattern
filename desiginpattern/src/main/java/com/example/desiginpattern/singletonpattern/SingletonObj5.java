package com.example.desiginpattern.singletonpattern;

/**
 * 登记式
 * 利用classloader机制保证初始化时只有一个进程，从而简单实现双校验的方式。
 */
public class SingletonObj5 {

    private SingletonObj5() {
    }

    private static class SingletonHolder {
        private static final SingletonObj5 mSingletonObj5 = new SingletonObj5();
    }

    public static final SingletonObj5 getInstance(){
        return SingletonHolder.mSingletonObj5;
    }

}
