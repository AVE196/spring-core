package ru.ave.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.ave.testing")
@EnableAspectJAutoProxy
public class TestingClass {

    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestingClass.class);

//        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
//        TaskExecutor taskExecutor2 = context.getBean(TaskExecutor.class);
//        TaskManager taskManager2 = context.getBean(TaskManager.class);
//        taskExecutor.executeTask();
//        taskExecutor2.executeTask();
//        taskManager2.printTask();

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        context.close();

    }

}
