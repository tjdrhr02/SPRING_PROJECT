package com.ft.first_spring.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
