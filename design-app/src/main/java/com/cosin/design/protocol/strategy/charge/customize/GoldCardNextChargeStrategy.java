package com.cosin.design.protocol.strategy.charge.customize;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "gold_card_next")
public class GoldCardNextChargeStrategy extends ProtocolStrategyHandler<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("---------gold_card_next_charge----------");
        return null;
    }

}
