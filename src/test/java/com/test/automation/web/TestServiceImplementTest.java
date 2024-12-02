package com.test.automation.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestServiceImplementTest {
    @Mock
    NotImplementedService notImplementedService;

    @InjectMocks
    TestServiceInterface testService;

    @Test
    @DisplayName("Test")
    void test() {
        int x = 5;
        int y = 10;

        Mockito.when(notImplementedService.square(x)).thenReturn(25);
        Mockito.when(notImplementedService.square(x)).thenReturn(100);

        int result = testService.job(5, 10);

        Assertions.assertEquals(x * x + y * y, result, "result should be " + (x * x + y * y) + ".");
    }
}