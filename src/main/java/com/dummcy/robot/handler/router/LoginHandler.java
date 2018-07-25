package com.dummcy.robot.handler.router;

import com.dummcy.robot.repository.common.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;



/**
 * 账户登录
 */
@Component
@AllArgsConstructor
public class LoginHandler extends RouterHandler {

    private AccountRepository accountRepository;

    /**
     * 用户登录
     * @param serverRequest
     * @param <T>
     * @return
     */
    public <T extends ServerResponse> Mono<T> login(ServerRequest serverRequest) {
//        return ServerResponse.ok()
//                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                .body();

        return null;
    }
}
