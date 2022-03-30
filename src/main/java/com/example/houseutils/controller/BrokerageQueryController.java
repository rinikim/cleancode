package com.example.houseutils.controller;

import com.example.houseutils.constants.ActionType;
import com.example.houseutils.policy.PurchaseBrokeragePolicy;
import com.example.houseutils.policy.RentBrokeragePolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    /**
     * 중개수수료를 계산한다.
     * @return 중개수수료
     */
    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        // TODO : 중개수수료 계산하는 로직
        if (actionType == ActionType.PURCHASE) {
            PurchaseBrokeragePolicy policy = new PurchaseBrokeragePolicy();
            return policy.calculate(price);
        }
        if (actionType == ActionType.RENT) {
            RentBrokeragePolicy policy = new RentBrokeragePolicy();
            return policy.calculate(price);
        }



        return null;


    }
}
