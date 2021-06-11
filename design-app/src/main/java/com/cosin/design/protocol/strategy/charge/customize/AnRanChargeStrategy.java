package com.cosin.design.protocol.strategy.charge.customize;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.RECHARGE + "anran")
public class AnRanChargeStrategy extends ProtocolStrategyHandler<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        System.out.println("---------anran_charge----------");
        return null;
    }

}
