package com.ssadhukhanv2.poc.configClient.beans;

import com.ssadhukhanv2.poc.configClient.profileconfigs.QAProfConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @Configuration
@Component
// @ConfigurationProperties("limits-service")
// limit-service.properties is the name of file in the git repository which the "config-server" is connected to
@ConfigurationProperties(prefix = "limit-service-mappings-prefix")
public class Limit {
    /*
    * @ConfigurationProperties is used to specify the properties prefix
    * if the class variable names matches the name specified in the properties files
    * they are automatically initialized
    * Example "profileName" & "profileDetails"
    * */


    private String profileName;
    private String profileDetails;


    @Value("${limit-service.minimum}")
    private int min;


    @Value("${limit-service.maximum}")
    private int max;


    @Value("This is a value directly assigned from Value Annotation")
    private String assignedDirectlyFromValues;


    //Fetch Values from List in the properties file
    @Value("${limit-service.countryList}")
    private List<String> countries;


    //Fetch Values from Map in the properties file
    @Value("#{${limit-service.country-capital-mapping}}")
    private Map<String,String> countryCapital;

}
