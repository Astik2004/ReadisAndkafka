package com.astik.reddis.redistut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    // Try hitting this in Postman: POST http://localhost:8080/set?key=testKey&value=HelloRedis
    @PostMapping("/set")
    public String setValue(@RequestParam String key, @RequestParam String value) {
        // opsForValue() is the method used to manipulate basic Strings in Redis
        redisTemplate.opsForValue().set(key, value);
        return "Saved successfully to Redis!";
    }

    // Try hitting this in your browser: GET http://localhost:8080/get?key=testKey
    @GetMapping("/get")
    public Object getValue(@RequestParam String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
