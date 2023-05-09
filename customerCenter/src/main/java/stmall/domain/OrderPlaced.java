package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String orderID;
    private String productID;
    private String userID;
    private String address;
    private String customerID;
    private Integer amount;
    private String productName;
    private Integer qty;
    private String status;
}
