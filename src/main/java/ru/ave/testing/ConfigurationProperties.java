package ru.ave.testing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationProperties {

    @Value("${test.string}")
    private String name;

    @Value("#{'${test.list}'.split(',')}")
    private List<String> list;

    @Value("#{${test.map}}")
    private Map<String, Integer> map;

    @Override
    public String toString() {
        return "ConfigurationProperties{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    @Value("#{'${test.list}'.split(',')}")
    public List<Integer> numbers;

    public void checkResult() {
        for(String s: list) {
            System.out.println(s);
        }
        System.out.println(map);

        System.out.println(numbers.get(1).getClass());
    }


























}
