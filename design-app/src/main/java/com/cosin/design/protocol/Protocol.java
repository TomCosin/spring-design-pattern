package com.cosin.design.protocol;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.ProtocolStrategy;

import java.util.Map;

public class Protocol {

    /**
     * 协议id
     */
    private String protocolId;

    /**
     * 充值策略
     */
    private ProtocolStrategy<ChargeRequest,ChargeResult> chargeStrategy;

    /**
     * 注册策略
     */
    private ProtocolStrategy<RegisterRequest,RegisterResult> registerStrategy;

    /**
     * 充值方法
     */
    public ChargeResult charge(ChargeRequest chargeRequest){
        return chargeStrategy.execute(chargeRequest);
    }

    /**
     * 注册方法
     */
    public RegisterResult register(RegisterRequest registerRequest){
        return registerStrategy.execute(registerRequest);
    }
}
