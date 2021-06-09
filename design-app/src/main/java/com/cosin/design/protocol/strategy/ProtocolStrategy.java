package com.cosin.design.protocol.strategy;

/**
 * 协议执行接口
 * @param <T> 入参
 * @param <R> 出参
 */
public interface ProtocolStrategy<T, R> {

    R execute(T t);

}
