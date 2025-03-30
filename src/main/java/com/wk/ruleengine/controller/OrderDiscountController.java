package com.wk.ruleengine.controller;

import com.wk.ruleengine.model.OrderDiscount;
import com.wk.ruleengine.model.OrderRequest;
import com.wk.ruleengine.service.OrderDiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderDiscountController {


    private final OrderDiscountService orderDiscountService;

    @PostMapping("/getDiscount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }


}