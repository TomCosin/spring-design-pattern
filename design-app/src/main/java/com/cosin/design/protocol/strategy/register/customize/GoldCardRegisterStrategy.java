package com.cosin.design.protocol.strategy.register.customize;

import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.REGISTER + "gold_card")
public class GoldCardRegisterStrategy implements StrategyExecutor<RegisterRequest, RegisterResult> {

    @Override
    public RegisterResult execute(RegisterRequest registerRequest) {
        System.out.println("---------gold_card_register--------");
        return null;
    }

}
