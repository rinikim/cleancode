package com.example.houseutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 배포 후 실행이 제대로 되는지 확인하는 controller
 * (서버가 응답을 받을 수 있는지 없는지 확인)
 * 서버 msa 를 만들 때 healthCheck 할 수 있는 controller 를 만든다.
 */
@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }



}
