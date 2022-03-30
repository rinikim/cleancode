package com.example.houseutils.constants;

import lombok.AllArgsConstructor;

/**
 * 부동산 매매 / 임대 정의
 */
@AllArgsConstructor
public enum ActionType {
    PURCHASE("매매"),
    RENT("임대차");

    public String description;
}
