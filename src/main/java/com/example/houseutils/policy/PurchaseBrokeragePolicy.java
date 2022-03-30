package com.example.houseutils.policy;

/**
 * 매매일 때 중개 수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy {
    public Long calculate(Long price) {
        // TODO : 가격을 받아서 중개수수료를 계산한다.

        // 좋지 않은 코드 : 룰을 생성해주고, 룰을 계산해주는 것이 함께 있어서 (룰을 만들어 주는 것을 분리한다.)
        BrokerageRule rule;
        if (price < 50000000) {
            rule = new BrokerageRule(0.6, 250000L);
        } else if (price < 200000000) {
            rule = new BrokerageRule(0.5, 800000L);
        } else if (price < 600000000) {
            rule = new BrokerageRule(0.4, null);
        } else if (price < 900000000) {
            rule = new BrokerageRule(0.5, null);
        } else {
            rule = new BrokerageRule(0.9, null);
        }
        return rule.calcMaxBrokerage(price);
    }
}
