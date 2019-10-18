package com.utils;

/**
 * 类型转换接口
 * @param <S>
 * @param <T>
 */
public interface Converter<S, T> {

    /**
     * 类型转换接口
     * @param source
     * @return
     */
    T convert(S source);

}
