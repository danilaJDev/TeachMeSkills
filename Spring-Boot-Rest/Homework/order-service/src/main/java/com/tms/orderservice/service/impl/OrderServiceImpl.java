package com.tms.orderservice.service.impl;

import com.tms.orderservice.client.UserClient;
import com.tms.orderservice.dto.OrderResponse;
import com.tms.orderservice.dto.StoreRequest;
import com.tms.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final UserClient userClient;

    @Override
    public OrderResponse createOrder(StoreRequest storeRequest) {

        var user = userClient.getById(storeRequest.getId());

        return OrderResponse.builder()
                .orderId(UUID.randomUUID())
                .login(user.getLogin())
                .phone(user.getPhone())
                .build();
    }

}
