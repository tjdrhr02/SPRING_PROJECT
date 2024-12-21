package com.ft.first_spring;

import com.ft.first_spring.member.MemberService;
import com.ft.first_spring.order.OrderService;

public class App {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();


    }
}
