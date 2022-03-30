package com.example.houseutils.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 자료구조 : 데이터 접근 후 값 제공
 * 참고 : 코틀린 같은 경우는 getter, setter 만드는 것이 코드 낭비이다.
 */
@Entity
@Getter
@Setter
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String address;

    @Column(nullable = false)
    public Long price;
}
