package org.pmos.gateway.utils;

import cn.hutool.core.exceptions.ValidateException;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTValidator;
import cn.hutool.jwt.signers.JWTSigner;
import cn.hutool.jwt.signers.JWTSignerUtil;
import org.pmos.gateway.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.security.KeyPair;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

@Component
public class JwtTool {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public JwtTool() {

    }

    /**
     * 解析token
     *
     * @param token token
     * @return 解析刷新token得到的用户信息
     */
    public Long parseToken(String token) {
        // 1.校验token是否为空
        if (token == null) {
            throw new UnauthorizedException("未登录");
        }
        // 2.校验并解析jwt
        String[] split = token.split("-");
        Long expire = stringRedisTemplate.opsForHash().getOperations().getExpire(token);

        // 3.校验token是否过期
        if (expire == null) {
            throw new UnauthorizedException("登录过期");
        }
        if (expire > 0) {
            return Long.parseLong(split[0]);
        }
        if (needTokenRefresh(expire)) {
            stringRedisTemplate.opsForHash().getOperations().expire(token, Duration.ofMinutes(60));
        }

        return expire;


    }

    private boolean needTokenRefresh(Long expire) {
        return expire <= 30;
    }
}