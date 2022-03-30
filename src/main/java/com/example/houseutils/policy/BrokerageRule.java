package com.example.houseutils.policy;

import lombok.AllArgsConstructor;

/**
 * 가격이 특정 범위일 때 상한요율과 상한금액 가지는 클래스
 */
@AllArgsConstructor
public class BrokerageRule {
    private Double brokeragePercent; // 상한요율
    private Long limitAmount;        // 한도액

    public Long calcMaxBrokerage(Long price) {
        if (limitAmount == null) {
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmount);
    }

    /**
     * 거래금액 * 상한요율
     * @return amount
     */
    private Long multiplyPercent(Long price) {
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
}
