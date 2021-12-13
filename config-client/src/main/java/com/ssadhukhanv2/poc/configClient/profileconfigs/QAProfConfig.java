package com.ssadhukhanv2.poc.configClient.profileconfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
@Profile(value = "qa")
public class QAProfConfig implements ProfConfig{
    /*
    * This is loaded when spring.profiles.active=qa
    * */

    @Autowired
    Environment environment;

    @PostConstruct
    public void complete(){
        System.out.println("QAProfConfig loaded with: "+environment.toString());
    }
}
