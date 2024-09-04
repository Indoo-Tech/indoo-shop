package com.indoo.shop.controllers;

import com.indoo.shop.services.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@AllArgsConstructor
public class ShopController {
    private ShopService shopService;

    @PostMapping("/buy")
    public String buy(@RequestParam("order") String order) {
        shopService.initiatePurchase(order);
        return "Order: "+order+" Initiated";
    }
}
