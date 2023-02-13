package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String status;
    private Long customerId;
    private Long productId;
    private Integer qty;
    private Long customerId;
    private Long productId;
    private Integer qty;
    private String status;
    private Long customerId;
    private Long productId;
    private Integer qty;
    private Long customerId;
    private Long productId;
    private Integer qty;
    private String status;
    private Long customerId;
    private Long productId;
    private Integer qty;
    private Long customerId;
    private Long productId;
    private Integer qty;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
