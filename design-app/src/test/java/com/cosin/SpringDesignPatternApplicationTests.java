package com.cosin;

import com.cosin.design.dto.ChargeRequest;
import com.cosin.design.dto.ChargeResult;
import com.cosin.design.protocol.dto.ProtocolDto;
import com.cosin.design.protocol.execute.ProtocolServiceFactory;
import com.cosin.design.protocol.strategy.ProtocolStrategyHandler;
import com.cosin.design.protocol.strategy.StrategyConstant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class SpringDesignPatternApplicationTests {

    @Autowired
    private ProtocolServiceFactory protocolServiceFactory;

    @Test
    void contextLoads() {
        ProtocolDto protocolDto = new ProtocolDto();
        extracted(protocolDto);
        ProtocolStrategyHandler<ChargeRequest, ChargeResult> handler = protocolServiceFactory.instanceProtocolExecutor(protocolDto, StrategyConstant.REGISTER);
        handler.handle(new ChargeRequest());
    }

    private void extracted(ProtocolDto protocolDto) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("center");
        map.put(StrategyConstant.REGISTER, strings);
        protocolDto.setStrategyMap(map);
    }

}
