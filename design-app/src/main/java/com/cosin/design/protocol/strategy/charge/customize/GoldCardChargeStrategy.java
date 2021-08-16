package com.cosin.design.protocol.strategy.charge.customize;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "gold_card")
public class GoldCardChargeStrategy implements StrategyExecutor<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("---------gold_card_charge----------");
        return null;
    }

}
