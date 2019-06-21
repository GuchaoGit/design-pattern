package com.guc.pattern.generics;

import java.util.List;

/**
 * 泛型工具
 */
public class GenericsUtils {

    /**
     * 比较三个值并返回最大值
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }

    /**
     * 强制类型转换
     * @param obj 数据
     * @param <T> 目标类型
     * @return 返回目标类型数据
     */
    @SuppressWarnings("unchecked unused")
    public static <T> T typeCast(Object obj){
        return (T)obj;
    }

    /**
     * 类型通配符
     * @param datas 数据
     */
    public static void getData(List<?> datas) {
        System.out.print("data first element is :" + datas.get(0) + "\ndata size is :" + datas.size());
    }
}
