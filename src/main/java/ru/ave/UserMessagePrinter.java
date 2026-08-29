package ru.ave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserMessagePrinter {

    private UserMessageService userMessageService;

    @Autowired
    public UserMessagePrinter(@Qualifier("userMessageServiceImpl") UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        System.out.println(userMessageService.createMessage(name));
    }

    public void testMethodPrinter() {
        userMessageService.testMethod();
    }
}
