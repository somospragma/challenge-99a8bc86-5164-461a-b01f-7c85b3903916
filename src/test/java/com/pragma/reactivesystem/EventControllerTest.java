package com.pragma.reactivesystem;

import com.pragma.reactivesystem.controller.EventController;
import com.pragma.reactivesystem.service.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EventControllerTest {
    @Autowired
    private EventController eventController;

    @MockBean
    private EventService eventService;

    @Test
    public void testProcessEvent() {
        String event = "testEvent";
        when(eventService.processEvent(event)).thenReturn(Mono.just("Processed: " + event));
        Mono<String> result = eventController.processEvent(event);
        assertEquals("Processed: testEvent", result.block());
    }
}