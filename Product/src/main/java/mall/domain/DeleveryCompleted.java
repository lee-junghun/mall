package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
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
}


