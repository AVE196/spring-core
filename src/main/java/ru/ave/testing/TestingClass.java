package ru.ave.testing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.ave.testing")
public class TestingClass {



    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestingClass.class);

        var test = context.getBean(ConfigurationProperties.class);
        System.out.println(test);

        test.checkResult();
        System.out.println(test.numbers);



//        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
//        TaskExecutor taskExecutor2 = context.getBean(TaskExecutor.class);
//        TaskManager taskManager = context.getBean(TaskManager.class);
//        TaskManager taskManager2 = context.getBean(TaskManager.class);
//        taskExecutor.executeTask();
//        taskExecutor2.executeTask();
//        taskManager.printTask();
//        taskManager2.printTask();
//
//        context.close();

    }

}
