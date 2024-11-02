package org.pmos.userservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @RequestMapping("/user/send/{phone}")
    public void send (@PathVariable("phone") String phone) throws Exception {

    }
}