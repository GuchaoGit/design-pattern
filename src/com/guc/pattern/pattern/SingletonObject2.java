package com.guc.pattern.pattern;

public class SingletonObject2 {
    /**
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：较复杂
     * <p>
     * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
     */
    private volatile static SingletonObject2 singletonObject2;

    private SingletonObject2() {
    }

    public static SingletonObject2 getInstance() {
        if (singletonObject2 == null) {
            synchronized (SingletonObject2.class) {
                if (singletonObject2 == null) {
                    singletonObject2 = new SingletonObject2();
                }
            }
        }
        return singletonObject2;
    }

    public void showMessage() {
        System.out.println("单例模式二：双检锁/双重校验锁（如果有其他特殊的需求）");
    }
}
