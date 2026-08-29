package ru.ave;

import org.springframework.stereotype.Component;

//@Component
public class UserMessageService {

    public String createMessage(String name) {
        return "Привет, " + name + ", добро пожаловать!";
    }

}
