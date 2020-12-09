package com.allen;

public class MonitorUtil {

    private static final ThreadLocal<Long> startTime = new ThreadLocal<>();

    public static void start() {
        startTime.set(System.currentTimeMillis());
    }

    public static void end(String methodName) {
        long endTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时 --> " + (endTime - startTime.get()) + "ms");
    }
}
