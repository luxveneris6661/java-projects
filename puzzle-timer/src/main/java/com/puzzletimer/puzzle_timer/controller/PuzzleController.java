package com.puzzletimer.puzzle_timer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class PuzzleController {
    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of(
            "message", "Spring Boot is working!",
            "status", "success",
            "timestamp", String.valueOf(System.currentTimeMillis())
        );
    }
}