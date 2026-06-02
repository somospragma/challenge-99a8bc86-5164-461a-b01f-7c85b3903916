package com.pragma.reactivesystem.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    public Mono<String> processEvent(String event) {
        // Simulate asynchronous processing
        return Mono.just(event).map(e -> "Processed: " + e);
    }
}