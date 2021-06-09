package com.cosin.design.protocol.strategy.register;

import com.cosin.design.dto.RegisterRequest;
import com.cosin.design.dto.RegisterResult;
import com.cosin.design.protocol.strategy.ProtocolStrategy;
import org.springframework.stereotype.Service;

@Service
public class GoldCardRegisterStrategy implements ProtocolStrategy<RegisterRequest, RegisterResult> {


    @Override
    public RegisterResult execute(RegisterRequest registerRequest) {
        return null;
    }
}
