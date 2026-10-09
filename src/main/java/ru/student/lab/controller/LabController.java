package ru.student.lab.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LabController {

    @GetMapping("/hello")
    public String hello() {
        return "Vasileva BAS2402";
    }

    @GetMapping("/numbers")
    public List<Integer> numbers() {
        return List.of(1533);
    }
}