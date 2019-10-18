package com.utils;

import java.util.Objects;

/**
 * 对象工具类
 */
public class ObjectUtils {

    /**
     * 判断对象为空
     * @param obj
     * @return
     */
    public boolean isNull(Object obj){
        return Objects.isNull(obj);
    }

    /**
     * 判断对象非空
     * @param obj
     * @return
     */
    public boolean nonNull(Object obj){
        return Objects.nonNull(obj);
    }

    public static boolean isEmpty(Object[] array) {
        return (array == null || array.length == 0);
    }
}
