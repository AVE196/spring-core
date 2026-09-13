package ru.ave.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PlannerService {

    private PlannerProperties properties;

    @Value("${planner.enabled}")
    private boolean isPlannerEnable;

    public PlannerService(PlannerProperties properties) {
        this.properties = properties;
    }

    public void printConfig() {
        System.out.println(properties);
        System.out.println(isPlannerEnable);
    }


}
