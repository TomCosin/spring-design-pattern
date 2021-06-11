package com.cosin.design.protocol.strategy.register.customize;

import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.springframework.stereotype.Service;

@Service(StrategyConstant.REGISTER + "an_ran")
public class AnRanRegisterStrategy extends ProtocolStrategyHandler<RegisterRequest, RegisterResult> {

    @Override
    public RegisterResult execute(RegisterRequest registerRequest) {
        System.out.println("---------anran_register--------");
        return null;
    }

}
