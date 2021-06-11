package com.cosin.design.protocol.strategy;

/**
 * 协议执行执行器
 *
 * @param <T> 入参
 * @param <R> 出参
 */
public abstract class ProtocolStrategyHandler<T, R> {

    private ProtocolStrategyHandler<T, R> next;

    /**
     * 每个执行器需要执行的单元方法
     *
     * @param t 入参
     * @return 出参
     */
    protected abstract R execute(T t);

    /**
     * 设置下个处理器
     *
     * @param next 处理逻辑
     */
    public void setNext(ProtocolStrategyHandler<T, R> next) {
        this.next = next;
    }

    /**
     * 入参
     *
     * @param t 入参
     * @return 出参
     */
    public R handle(T t) {
        R r = execute(t);
        if (next != null) {
            r = next.handle(t);
        }
        return r;
    }

}
