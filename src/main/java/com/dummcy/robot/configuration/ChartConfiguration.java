package com.dummcy.robot.configuration;

import com.dummcy.robot.chart.Wechat;
import com.dummcy.robot.handler.MessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChartConfiguration {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Wechat wechat(MessageHandler messageHandler){
        return new Wechat(messageHandler);
    }
}
