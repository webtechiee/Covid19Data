package com.example.covid19.data.controllers;

import com.example.covid19.data.models.Covid;
import com.example.covid19.data.services.Covid19DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("v1")
@RestController
@RequiredArgsConstructor

public class Covid19DataController {
    private final Covid19DataService covid19DataService;
@GetMapping("get")
    public Mono<Covid> getCountryData(@RequestParam String country) {
        return covid19DataService.getCountryData(country);
    }
    }
