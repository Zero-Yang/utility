package com.utils;

/**
 * 字符工具类
 */
public class CharUtils {

    /**
     * 比较两个字符是否相同
     *
     * @param c1 字符1
     * @param c2 字符2
     * @param ignoreCase 是否忽略大小写
     * @return 是否相同
     * @since 4.0.3
     */
    public static boolean equals(char c1, char c2, boolean ignoreCase) {
        if (ignoreCase) {
            return Character.toLowerCase(c1) == Character.toLowerCase(c2);
        }
        return c1 == c2;
    }

}
