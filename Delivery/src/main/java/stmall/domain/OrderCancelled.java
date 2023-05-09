package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer amount;
    private String productName;
    private Integer qty;
    private String status;
}
