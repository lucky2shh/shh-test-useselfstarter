package cn.shh.boot.starter.use.config;

import cn.shh.boot.starter.autoconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfStarterUseConfig {
    @Bean
    public HelloService helloService(){
        return new HelloService("SelfStarter MyConfig");
    }
}
