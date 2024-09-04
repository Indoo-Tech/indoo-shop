package com.indoo.shop.services;

import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class ShopService {

    private static final String PURCHASE_TOPIC = "purchase-initiation-topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ShopService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void initiatePurchase(String purchaseData) {
        kafkaTemplate.send(PURCHASE_TOPIC, purchaseData);
        System.out.println("Purchase: " + purchaseData);
    }
}
