# Exceptions Encountered
* ConfigDataMissingEnvironmentPostProcessor$ImportException: No spring.config.import set
  https://stackoverflow.com/questions/66813147/springcloud-2020-0-2-upgrade-generates-testing-error
 
        org.springframework.cloud.commons.ConfigDataMissingEnvironmentPostProcessor$ImportException: No spring.config.import set

* Ran into below error while committing changes from local repo to github. Below commands saved the day:
  * https://stackoverflow.com/questions/37770467/why-do-i-have-to-git-push-set-upstream-origin-branch
  * https://stackoverflow.com/questions/47403358/fatal-in-unpopulated-submodule

        git pull origin main --allow-unrelated-histories
        git push -u origin main


    C:\Users\subhr\digital-toddling\spring-cloud\my-pocs\spring-cloud-config-server>git push -u origin main
    To https://github.com/ssadhukhanv2/spring-cloud-config-server.git
    ! [rejected]        main -> main (non-fast-forward)
    error: failed to push some refs to 'https://github.com/ssadhukhanv2/spring-cloud-config-server.git'
    hint: Updates were rejected because the tip of your current branch is behind
    hint: its remote counterpart. Integrate the remote changes (e.g.
    hint: 'git pull ...') before pushing again.
    hint: See the 'Note about fast-forwards' in 'git push --help' for details.
    
    C:\Users\subhr\digital-toddling\spring-cloud\my-pocs\spring-cloud-config-server>git pull
    There is no tracking information for the current branch.
    Please specify which branch you want to merge with.
    See git-pull(1) for details.
    
        git pull <remote> <branch>
    
    If you wish to set tracking information for this branch you can do so with:
    
        git branch --set-upstream-to=origin/<branch> main

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#production-ready)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

