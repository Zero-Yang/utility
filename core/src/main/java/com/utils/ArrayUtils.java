package com.utils;

public class ArrayUtils {

    public static boolean isArray(Object obj) {
        return (obj != null && obj.getClass().isArray());
    }
}
