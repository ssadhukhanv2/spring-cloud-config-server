package com.ssadhukhanv2.poc.configClient.controllers;

import com.ssadhukhanv2.poc.configClient.beans.Limit;
import com.ssadhukhanv2.poc.configClient.profileconfigs.ProfConfig;
import com.ssadhukhanv2.poc.configClient.profileconfigs.QAProfConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitController {

    @Autowired
    private ProfConfig qaProfConfig;

    Limit limit;

    LimitController(Limit limit) {
        this.limit = limit;
    }

    @GetMapping("/limits")
    public ResponseEntity<Limit> returnStaticLimits() {
        return ResponseEntity.ok().body(new Limit("static","Dummy-Not using Spring Cloud Config Server", 0, 56, null, null, null));
    }

    @GetMapping("/limits-from-prop")
    public ResponseEntity<Limit> returnLimitsFromProperties() {
        return ResponseEntity.ok().body(limit);
    }

}
