package com.ft.first_spring.discount;

import com.ft.first_spring.member.Grade;
import com.ft.first_spring.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
             return discountFixAmount;
        } else {
            return 0;
        }

    }
}
