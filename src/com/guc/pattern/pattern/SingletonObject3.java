package com.guc.pattern.pattern;

public class SingletonObject3 {
    /**
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：一般
     * <p>
     * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
     * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
     */
    private static class SingletonHolder {
        private static final SingletonObject3 INSTANCE = new SingletonObject3();
    }

    private SingletonObject3() {
    }

    public static final SingletonObject3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public void showMessage() {
        System.out.println("单例模式三：登记式/静态内部类（明确实现 lazy loading 效果时使用）");
    }
}
