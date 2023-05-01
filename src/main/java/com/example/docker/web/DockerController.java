package com.example.docker.web;

import com.example.docker.entity.Member;
import com.example.docker.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DockerController {

    private final MemberRepository memberRepository;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return name;
    }

    @PostMapping("/{name}")
    public String add(@PathVariable("name") String name) {
        memberRepository.save(new Member(name));
        return name;
    }

    @GetMapping("/docker/{num}")
    public String test(@PathVariable("num") String num) {
        return num;
    }
}
