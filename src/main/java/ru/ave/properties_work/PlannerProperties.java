package ru.ave.properties_work;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PlannerProperties {

    private final int defaultDuration;
    private final int batchSize;

    public PlannerProperties(@Value("${planner.default-duration:10}") int defaultDuration
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

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public int getBatchSize() {
        return batchSize;
    }
}
