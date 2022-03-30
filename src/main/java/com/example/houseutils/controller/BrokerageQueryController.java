package com.example.houseutils.controller;

import com.example.houseutils.constants.ActionType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    /**
     * 중개수수료를 계산한다.
     * @return
     */
    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        // TODO : 중개수수료 계산하는 로직



        return null;


    }
}