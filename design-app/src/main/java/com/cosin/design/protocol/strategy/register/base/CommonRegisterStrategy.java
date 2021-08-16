package com.cosin.design.protocol.strategy.register.base;

import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.protocol.strategy.StrategyExecutor;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.REGISTER + "center")
public class CommonRegisterStrategy implements StrategyExecutor<RegisterRequest, RegisterResult> {

    @Override
    public RegisterResult execute(RegisterRequest registerRequest) {
        System.out.println("---------common_register--------");
        return null;
    }

}
