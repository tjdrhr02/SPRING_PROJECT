package com.ft.first_spring;

import com.ft.first_spring.discount.FixDiscountPolicy;
import com.ft.first_spring.member.MemberService;
import com.ft.first_spring.member.MemberServiceImpl;
import com.ft.first_spring.member.MemoryMemberRepository;
import com.ft.first_spring.order.OrderService;
import com.ft.first_spring.order.OrderServiceImpl;

public class AppConfig {

    // 역할
    // 구현

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    private FixDiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
