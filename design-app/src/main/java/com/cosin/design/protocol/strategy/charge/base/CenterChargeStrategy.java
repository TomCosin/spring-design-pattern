package com.cosin.design.protocol.strategy.charge.base;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "center")
public class CenterChargeStrategy extends ProtocolStrategyHandler<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("-----------base_charge----------");
        return null;
    }
}
