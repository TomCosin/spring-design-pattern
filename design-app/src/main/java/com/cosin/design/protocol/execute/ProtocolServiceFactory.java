package com.cosin.design.protocol.execute;

import com.cosin.design.protocol.dto.ProtocolDto;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ProtocolServiceFactory {

    /**
     * 策略集合
     */
    @Autowired
    private Map<String, ProtocolStrategyHandler> chargeStrategyFactory;

    public <T,R> ProtocolStrategyHandler<T,R> instanceProtocolExecutor(ProtocolDto protocolDto, String operate) {
        // 1.取出需要执行的操作集合
        ProtocolStrategyHandler<T,R> startHandler = null;
        ProtocolStrategyHandler<T,R> cursor = null;
        List<String> strategies = protocolDto.getStrategyMap().get(operate);
        // 2.构建执行链
        for (String strategyStr : strategies) {
            if (startHandler == null) {
                // 2.1初始化第一个节点
                startHandler = chargeStrategyFactory.get(operate + strategyStr);
                cursor = chargeStrategyFactory.get(operate + strategyStr);
            } else {
                // 2.2设置下一个节点，并移动游标
                ProtocolStrategyHandler<T,R> next = chargeStrategyFactory.get(operate + strategyStr);
                cursor.setNext(next);
                cursor = next;
            }

        }
        return startHandler;
    }

}
