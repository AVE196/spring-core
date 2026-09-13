package ru.ave.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserMessageServiceImpl implements UserMessageService {

    private UserMessagePrinter userMessagePrinter;

    @Autowired()
    @Lazy
    public UserMessageServiceImpl(UserMessagePrinter userMessagePrinter) {
        this.userMessagePrinter = userMessagePrinter;
    }

    @Override
    public String createMessage(String name) {
        return "Привет, " + name + ", добро пожаловать!";
    }

    public void testMethod() {
        userMessagePrinter.printMessage("ho-ho-ho");
    }

}
