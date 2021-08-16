package com.cosin.design.protocol.execute;

import com.cosin.design.protocol.strategy.StrategyExecutor;

/**
 * 协议执行执行器
 *
 * @param <T> 入参
 * @param <R> 出参
 * @author G003892
 */
public class ProtocolStrategyHandler<T, R> {

    protected StrategyExecutor<T, R> strategyExecutor;

    protected ProtocolStrategyHandler<T, R> next;

    /**
     * 入参
     *
     * @param t 入参
     * @return 出参
     */
    public R handle(T t) {
        R r = strategyExecutor.execute(t);
        if (next != null) {
            r = next.handle(t);
        }
        return r;
    }

}
