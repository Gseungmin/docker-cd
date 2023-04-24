package com.example.docker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return name;
    }

    @GetMapping("/docker/{num}")
    public String test(@PathVariable("num") String num) {
        return num;
    }
}
