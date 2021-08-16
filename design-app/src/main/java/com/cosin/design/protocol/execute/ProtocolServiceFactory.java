package com.cosin.design.protocol.execute;

import com.cosin.design.protocol.dto.ProtocolDto;
import com.cosin.design.protocol.exception.ProtocolException;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * protocol combine factory
 *
 * @author G003892
 */
@Component
public class ProtocolServiceFactory {

    /**
     * 策略集合
     */
    @Autowired
    @SuppressWarnings("rawtypes")
    private Map<String, StrategyExecutor> chargeStrategyFactory;

    public <T, R> ProtocolStrategyHandler<T, R> instanceProtocolExecutor(ProtocolDto protocolDto, String operate) {
        // combine protocolDto
        // 1.取出需要执行的操作集合
        List<String> strategies = protocolDto.getStrategyMap().get(operate);
        // 2.构建执行链
        //  初始化原始链
        //   游标节点
        ProtocolStrategyHandler<T, R> cursor = new ProtocolStrategyHandler<>();
        //   初始头节点
        ProtocolStrategyHandler<T, R> head = null;
        for (String strategyStr : strategies) {
            //noinspection rawtypes
            StrategyExecutor strategyExecutor = chargeStrategyFactory.get(operate + strategyStr);
            if (strategyExecutor == null) {
                throw new ProtocolException("系统中暂无该配置策略，策略名称：" + strategyStr);
            }
            // 构建新的节点
            ProtocolStrategyHandler<T, R> protocolStrategyHandler = new ProtocolStrategyHandler<>();
            //noinspection unchecked
            protocolStrategyHandler.strategyExecutor = strategyExecutor;
            // 如果头节点没有，那么第一个新节点，就是头节点
            if(head == null){
                head = protocolStrategyHandler;
            }
            // 设置游标的下一个节点
            cursor.next = protocolStrategyHandler;
            // 移动游标
            cursor = protocolStrategyHandler;
        }
        return head;
    }

}
