package com.example.command_pipeliner.appcore.domain.model.order;

import com.example.command_pipeliner.appcore.domain.model.common.DomainEvent;
import com.example.command_pipeliner.appcore.domain.model.common.PrecisionMoney;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderEvent extends DomainEvent {

    @Data
    @NoArgsConstructor
    public static class OrderItem {

        Long productId;
        Integer count;
        PrecisionMoney amount;
    }

    Long userId;
    PrecisionMoney discount;
    PrecisionMoney paidAmount;
    List<OrderItem> orderItems;
}
