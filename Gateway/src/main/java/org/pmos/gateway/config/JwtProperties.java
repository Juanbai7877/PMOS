package org.pmos.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

import java.time.Duration;

/**
 * @author ALL
 * @date 2024/11/9
 * @Description
 */
@Data
@ConfigurationProperties(prefix = "pmos.jwt")
public class JwtProperties {
    private Duration tokenTTL = Duration.ofMinutes(10);
}
