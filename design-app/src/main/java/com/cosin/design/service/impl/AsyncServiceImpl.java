package com.cosin.design.service.impl;

import com.cosin.design.dao.OptionLogRepository;
import com.cosin.design.entity.OptionLog;
import com.cosin.design.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Autowired
    private OptionLogRepository optionLogRepository;

    @Async("dataSaveExecutor")
    @Override
    public void saveOptionLog(OptionLog optionLog){
        optionLogRepository.save(optionLog);
    }

}
