package com.ft.first_spring.discount;

import com.ft.first_spring.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
