package org.pmos.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALL
 * @date 2024/5/19
 * @Description
 */
@RestController
@RequestMapping("/Hello")
public class HelloController {
    @GetMapping
    public String test(){
        return "hello,world";
    }
}
