package com.acyuta.microservices.limitsservice;

import com.acyuta.microservices.limitsservice.bean.LimitConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsConfigurationController {

    private final LimitsServiceProperties properties;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration().setMaximum(properties.getMaximum()).setMinimum(properties.getMinimum()+1);
    }
}
