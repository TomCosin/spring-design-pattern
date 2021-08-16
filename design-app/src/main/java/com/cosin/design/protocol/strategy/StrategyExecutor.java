package com.cosin.design.protocol.strategy;

/**
 * 策略执行接口
 * @param <T> 入参
 * @param <R> 出参
 * @author G003892
 */
public interface StrategyExecutor<T, R>{


    /**
     * 每个执行器需要执行的单元方法
     * @param t 入参
     * @return 出参
     */
    R execute(T t);
}
