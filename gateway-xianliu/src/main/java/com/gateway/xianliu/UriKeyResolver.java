package com.gateway.xianliu;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName UriKeyResolver
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/8.
 */
public class UriKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange serverWebExchange) {
        return Mono.just(serverWebExchange.getRequest().getURI().getPath());
    }
}
