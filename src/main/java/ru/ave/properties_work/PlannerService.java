package ru.ave.properties_work;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlannerService {

    @Value("${planner.enabled:false}")
    private boolean isPlannerEnable;

    private final PlannerProperties properties;

    public PlannerService(PlannerProperties properties) {
        this.properties = properties;
    }

    public void printConfig() {
        System.out.println(properties);
        System.out.println(isPlannerEnable);
    }
}
