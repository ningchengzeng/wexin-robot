package com.dummcy.robot.handler.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> routeLogin(LoginHandler loginHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/login")
                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON_UTF8)),
                        loginHandler::login);
    }
}
