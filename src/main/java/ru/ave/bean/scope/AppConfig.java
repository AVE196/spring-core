package ru.ave.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.ave.bean.scope")
public class AppConfig {

    static void main() {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        JobRunner runner = configApplicationContext.getBean(JobRunner.class);
        runner.runOnce();
        runner.runOnce();
        runner.runOnce();
        runner.runOnce();
        runner.runOnce();


    }




}
