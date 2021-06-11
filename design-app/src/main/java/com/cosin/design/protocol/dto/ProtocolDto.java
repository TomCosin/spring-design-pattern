package com.cosin.design.protocol.dto;

import java.util.List;
import java.util.Map;

/**
 * 协议dto
 */
public class ProtocolDto {

    private String protocolId;

    /**
     * key是操作功能：装表，充值
     * value是操作工作链路
     */
    private Map<String, List<String>> strategyMap;

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public Map<String, List<String>> getStrategyMap() {
        return strategyMap;
    }

    public void setStrategyMap(Map<String, List<String>> strategyMap) {
        this.strategyMap = strategyMap;
    }
}
