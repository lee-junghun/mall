package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeleveryCanceled extends AbstractEvent {

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

    public DeleveryCanceled(Delivery aggregate){
        super(aggregate);
    }
    public DeleveryCanceled(){
        super();
    }
}
