package com.guc.pattern.pattern;

/**
 * 单例模式
 */
public class SingletonObject {
    /**
     * 饿汉式
     * <p>
     * 是否 Lazy 初始化：否
     * 是否多线程安全：是
     * 实现难度：易
     * <p>
     * 描述：这种方式比较常用，但容易产生垃圾对象。
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     */
    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public void showMessage() {
        System.out.println("单例模式：建议使用该种饿汉方式");
    }
}
