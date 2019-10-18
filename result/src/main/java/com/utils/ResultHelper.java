package com.utils;

/**
 * 返回结果静态工具类
 */
public class ResultHelper {
    /**
     * 返回成功结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultT<T> success(T data) {
        return new ResultT<T>(data);
    }

    /**
     * 返回失败结果
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> ResultT<T> fail(String code,String message) {
        return new ResultT<T>(code,message);
    }
}
