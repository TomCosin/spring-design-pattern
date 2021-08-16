package com.cosin.design.protocol.strategy.charge.customize;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "anran")
public class AnRanChargeStrategy implements StrategyExecutor<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("---------anran_charge----------");
        return null;
    }

}
