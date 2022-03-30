package com.example.houseutils.policy;

/**
 * 매매일 때 중개 수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy {

    // 해당 함수는 매매와 임대차와 중복되는 것을 알 수 있다.
    public Long calculate(Long price) {
        // TODO : 가격을 받아서 중개수수료를 계산한다.
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }

    private BrokerageRule createBrokerageRule(Long price) {
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
        return rule;
    }
}
