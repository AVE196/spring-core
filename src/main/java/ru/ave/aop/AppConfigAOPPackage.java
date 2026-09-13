package ru.ave.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.ave.aop")
@EnableAspectJAutoProxy
public class AppConfigAOPPackage {
}
