package com.dummcy.robot.token;

import com.dummcy.robot.configuration.TokenConfiguration;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenDataBean implements InitializingBean {

    @Autowired
    private TokenConfiguration tokenConfiguration;

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
