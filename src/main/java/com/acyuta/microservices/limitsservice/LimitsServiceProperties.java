package com.acyuta.microservices.limitsservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
public class LimitsServiceProperties {
    private int minimum;
    private int maximum;
}
