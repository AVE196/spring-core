package ru.ave.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UserMessageServiceNormalized implements UserMessageService{

    @Override
    public String createMessage(String name) {
        return "Привет, "
                + name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase()
                + ", добро пожаловать!";
    }
}
