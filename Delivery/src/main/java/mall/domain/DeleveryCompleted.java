package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeleveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String productName;
    private String status;
    private Integer qty;
    private String productName;
    private String status;

    public DeleveryCompleted(Delivery aggregate){
        super(aggregate);
    }
    public DeleveryCompleted(){
        super();
    }
}
