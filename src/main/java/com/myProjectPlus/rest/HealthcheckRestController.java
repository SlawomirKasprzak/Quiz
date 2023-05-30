package com.myProjectPlus.rest;

import com.myProjectPlus.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthCheckDto healthcheck() {
        HealthCheckDto dto = new HealthCheckDto(true, "It's working!");
        return dto;
    }
}
