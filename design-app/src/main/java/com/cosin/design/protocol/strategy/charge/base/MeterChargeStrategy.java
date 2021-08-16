package com.cosin.design.protocol.strategy.charge.base;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "meter")
public class MeterChargeStrategy implements StrategyExecutor<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("------------meter_charge-------------");
        return null;
    }
}
