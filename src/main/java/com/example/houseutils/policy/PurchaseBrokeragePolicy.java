package com.example.houseutils.policy;

/**
 * 매매일 때 중개 수수료를 계산해주는 클래스
 */
public class PurchaseBrokeragePolicy implements BrokeragePolicy{

    public BrokerageRule createBrokerageRule(Long price) {
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
