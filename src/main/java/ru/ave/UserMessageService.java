package ru.ave;

public interface UserMessageService {

    String createMessage(String name);

    default void testMethod() {
        System.out.println("default realization");
    }

}
