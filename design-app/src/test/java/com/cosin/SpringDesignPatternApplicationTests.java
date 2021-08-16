package com.cosin;

import com.cosin.design.protocol.dto.ProtocolDto;
import com.cosin.design.protocol.execute.ProtocolServiceFactory;
import com.cosin.design.protocol.strategy.StrategyConstant;
import com.cosin.design.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class SpringDesignPatternApplicationTests {

    @Autowired
    private ProtocolServiceFactory protocolServiceFactory;

    @Autowired
    private TransactionService transactionService;

    @Test
    void contextLoads() {
        transactionService.updateCustomer("007",new BigDecimal("34"));
    }

    private void extracted(ProtocolDto protocolDto) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("center");
        strings.add("anran");
        map.put(StrategyConstant.RECHARGE, strings);
        protocolDto.setStrategyMap(map);
    }

}
