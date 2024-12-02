package com.test.automation.web;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestServiceImplement implements TestServiceInterface {
    private final NotImplementedService notImplementedService;

    @Override
    public int job(int x, int y) {
        return notImplementedService.square(x) + notImplementedService.square(y);
    }
}