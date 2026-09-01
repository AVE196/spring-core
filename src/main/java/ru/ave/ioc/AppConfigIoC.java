package ru.ave.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.ave.ioc")
public class AppConfigIoC {

//    @Bean
//    public UserMessageService userMessageService(){
//        return new UserMessageService();
//    }
//
//    @Bean
//    public UserMessagePrinter userMessagePrinter(UserMessageService userMessageService) {
//        return new UserMessagePrinter(userMessageService);
//    }

}
