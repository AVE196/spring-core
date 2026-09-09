package ru.ave.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PlannerProperties {

    private int defaultDuration;
    private int batchSize;

    public PlannerProperties(@Value("${planner.default-duration}") int defaultDuration
            , @Value("${planner.batch-size}") int batchSize) {
        this.defaultDuration = defaultDuration;
        this.batchSize = batchSize;
    }

    @Override
    public String toString() {
        return "PlannerProperties{" +
                "defaultDuration=" + defaultDuration +
                ", batchSize=" + batchSize +
                '}';
    }
}
