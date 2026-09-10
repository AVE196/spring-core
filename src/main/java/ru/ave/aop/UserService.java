package ru.ave.aop;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserService {

    @NotNullArgs
    public void findUser(String name, String surname, LocalDateTime dateOfBirth) {
        System.out.println("method run");
    }

}
