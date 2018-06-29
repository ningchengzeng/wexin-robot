package com.dummcy.robot.config;

import com.dummcy.robot.chart.Wechat;
import com.dummcy.robot.handler.MessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChartConfig {

    @Bean(initMethod = "start")
    public Wechat wechat(MessageHandler messageHandler){
        return new Wechat(messageHandler);
    }
}
