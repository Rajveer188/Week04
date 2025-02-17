package com.tit.week04.day06.reflection.advanced_level.dependency_injection;

public class Client {
    @Inject
    private Service service;

    public void requestService() {
        service.serve();
    }
}
