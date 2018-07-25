package com.dummcy.robot.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("dummcy")
public class TokenConfiguration {

    private Test test;

    @Data
    public static class Test{
        private String data;
    }
}
