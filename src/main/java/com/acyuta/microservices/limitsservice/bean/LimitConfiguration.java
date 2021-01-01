package com.acyuta.microservices.limitsservice.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class LimitConfiguration {
    private int maximum;
    private int minimum;
}
