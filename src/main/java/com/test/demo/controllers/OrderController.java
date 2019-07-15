package com.test.demo.controllers;

import com.test.demo.entities.OrderEntity;
import com.test.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("orders")
    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    @GetMapping("orders/{id}")
    public OrderEntity getOrderById(@PathVariable("id") Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @PostMapping("orders")
    public OrderEntity saveNewOrder(@RequestBody OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }
}
