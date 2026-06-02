package com.pragma.reactivesystem.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class EventRepository {
    public Mono<String> saveEvent(String event) {
        // Simulate asynchronous saving
        return Mono.just(event);
    }
}