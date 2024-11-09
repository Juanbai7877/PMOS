package org.pmos.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "pmos.auth")
public class AuthProperties {
    private List<String> includePaths;
    private List<String> excludePaths;
}
