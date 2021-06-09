package com.cosin.design.protocol.strategy.charge;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.strategy.ProtocolStrategy;
import org.springframework.stereotype.Service;

@Service
public class GoldCardChargeStrategy implements ProtocolStrategy<ChargeRequest, ChargeResult> {

    @Override
    public ChargeResult execute(ChargeRequest chargeRequest) {
        return null;
    }

}
