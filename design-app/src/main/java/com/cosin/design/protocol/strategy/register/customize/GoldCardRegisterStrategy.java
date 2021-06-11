package com.cosin.design.protocol.strategy.register.customize;

import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.REGISTER + "gold_card")
public class GoldCardRegisterStrategy extends ProtocolStrategyHandler<RegisterRequest, RegisterResult> {

    @Override
    public RegisterResult execute(RegisterRequest registerRequest) {
        System.out.println("---------gold_card_register--------");
        return null;
    }

}
