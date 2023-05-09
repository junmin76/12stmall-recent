package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String userId;
    private String address;
    private String customerId;
    private Integer amount;
    private String productName;
    private Integer qty;
    private String status;
}
